//package com.example.webapp.handler;
//
//import java.io.IOException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.AuthenticationFailureHandler;
//
///**
// * 
// * @author yandypiedra
// *
// */
//
//public class AuthnFailHandler implements AuthenticationFailureHandler {
//	
//	private static final Logger LOG = LogManager.getLogger(AuthnFailHandler.class.getName());
//	
//	@Override
//	public void onAuthenticationFailure(HttpServletRequest httpRequest, HttpServletResponse httpResponse, AuthenticationException authnExcep) throws IOException {
//		LOG.info("Authentication failed");		
//		//Do something here
//	}
//}
