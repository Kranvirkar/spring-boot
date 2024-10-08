package in.nit.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.access.AccessDeniedHandler;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class MyAcessDeniedHandler implements AccessDeniedHandler {

	private static Logger logger = LoggerFactory.getLogger(MyAcessDeniedHandler.class);


	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		// TODO Auto-generated method stub
		Authentication auth
		= SecurityContextHolder.getContext().getAuthentication();

		if (auth != null) {
			logger.info("User '" + auth.getName()
			+ "' attempted to access the protected URL: "
			+ request.getRequestURI());
		}

		response.sendRedirect(request.getContextPath() + "/403");

	}
}
