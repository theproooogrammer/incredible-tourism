package com.tourism.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(value = "com.tourism.controller")
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;

	}

	// To add css and all the file, add dependency and add files shown below
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/img/**").addResourceLocations("/img/");
		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
		registry.addResourceHandler("/nbproject/**").addResourceLocations("/nbproject/");
		registry.addResourceHandler("/scss/**").addResourceLocations("/scss/");
		registry.addResourceHandler("/vendor/**").addResourceLocations("/vendor/");

		registry.addResourceHandler("/vendor/bootstrap/css/**").addResourceLocations("/vendor/bootstrap/css/");
		registry.addResourceHandler("/vendor/bootstrap/js/**").addResourceLocations("/vendor/bootstrap/js/");
		registry.addResourceHandler("/vendor/fontawesome-free/css/**").addResourceLocations("/vendor/fontawesome-free/css/");
		registry.addResourceHandler("/vendor/fontawesome-free/webfonts/**").addResourceLocations("/vendor/fontawesome-free/webfonts/");
		registry.addResourceHandler("/vendor/jquery/**").addResourceLocations("/vendor/jquery/");
		registry.addResourceHandler("/vendor/jquery-easing/**").addResourceLocations("/vendor/jquery-easing/");
		registry.addResourceHandler("/vendor/simple-line-icons/css/**").addResourceLocations("/vendor/simple-line-icons/css/");
		registry.addResourceHandler("/vendor/simple-line-icons/fonts/**").addResourceLocations("/vendor/simple-line-icons/fonts/");
		
		
	}
}
