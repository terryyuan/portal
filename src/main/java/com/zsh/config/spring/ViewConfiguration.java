package com.zsh.config.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
public class ViewConfiguration {

	@Bean
	public ViewResolver urlBasedViewResolver(){
		UrlBasedViewResolver viewResolver  = new UrlBasedViewResolver();
		viewResolver.setOrder(2);
		viewResolver.setPrefix("/html/");
		viewResolver.setSuffix(".html");
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setCache(false);
		return viewResolver;
	}
	
}
