package in.nit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private MyAcessDeniedHandler accessDeniedHandler;
	
	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
		.antMatchers("/register","/save","/login").permitAll()
		.antMatchers("/emp").hasAuthority("EMPLOYEE")
		.antMatchers("/admin").hasAuthority("ADMIN")
		.anyRequest().authenticated()

		.and()
		.formLogin()
		.loginPage("/login")
		.loginProcessingUrl("/login")
		.defaultSuccessUrl("/common", true)
		.failureUrl("/login?error")

		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/login?logout")
		.invalidateHttpSession(true)

		.and()
		/*.exceptionHandling()
		.accessDeniedPage("/denied");*/
		.exceptionHandling().accessDeniedHandler(accessDeniedHandler);
	}
}
