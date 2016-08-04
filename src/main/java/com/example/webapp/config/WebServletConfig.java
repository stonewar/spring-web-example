package com.example.webapp.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


/**
 * 
 * @author yandypiedra
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.example.webapp.controller")
public class WebServletConfig extends WebMvcConfigurerAdapter {

	@Bean
	public ViewResolver ViewResolver(){
		InternalResourceViewResolver  intViewRes = new InternalResourceViewResolver();
		intViewRes.setPrefix("/WEB-INF/views/");
		intViewRes.setSuffix(".jsp");
		intViewRes.setViewClass(
	              org.springframework.web.servlet.view.JstlView.class); //JSTL support
		intViewRes.setExposeContextBeansAsAttributes(true);
		return intViewRes;
	}
	
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:i18n/messages");
		messageSource.setFallbackToSystemLocale(false);
		messageSource.setCacheSeconds(5000);
		return messageSource;
	}
	

//	 @Bean
//	 public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//	 PropertySourcesPlaceholderConfigurer propSourc = new PropertySourcesPlaceholderConfigurer();
//	 Resource resource = new ClassPathResource("properties/sp.setup.properties");
//	 propSourc.setLocation(resource);
//	 return propSourc;
//	 }
	
		
	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	
}
