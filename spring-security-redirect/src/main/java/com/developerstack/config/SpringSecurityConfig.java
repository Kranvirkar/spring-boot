package com.developerstack.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private SimpleAuthenticationSuccessHandler successHandler;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().requireCsrfProtectionMatcher(new AntPathRequestMatcher("**/login")).and().authorizeRequests()
				.antMatchers("/admin").hasRole("ADMIN")
				.antMatchers("/user").hasRole("USER")
				.and().formLogin().successHandler(successHandler)
				.loginPage("/login").and().logout().permitAll();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
		auth.inMemoryAuthentication().withUser("admin").password("password").roles("ADMIN");
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/*.css");
		web.ignoring().antMatchers("/*.js");
	}
}