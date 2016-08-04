package com.example.webapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 
 * @author yandypiedra
 *
 */
@Configuration
@EnableWebSecurity
//@PropertySource("classpath:/properties/user.properties")
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
//	@Autowired
//	private AuthnFailHandler authnFailHandler;
	
//	@Autowired
//    private Environment env;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
//		.formLogin()
//			.loginPage("/login")
//			.defaultSuccessUrl("/secure-resources")
//			.failureHandler(authnFailHandler)
		
		.authorizeRequests()
//			.antMatchers("/secure-resources").authenticated()
			.anyRequest().permitAll()
		.and()
		.csrf().disable();
//		.requiresChannel().anyRequest().requiresSecure();
	}
	
//	 @Override
//	protected void configure(AuthenticationManagerBuilder auth)
//			throws Exception {
//		auth
//		.inMemoryAuthentication()
//		.withUser(env.getProperty("hans.username")).password(env.getProperty("hans.password")).roles(env.getProperty("hans.roles"));
//	}

}
