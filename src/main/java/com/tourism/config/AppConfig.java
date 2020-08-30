package com.tourism.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import static org.hibernate.cfg.Environment.*;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@PropertySource("classpath:application.properties")
@ComponentScans(value = { @ComponentScan("com.tourism.dao"), @ComponentScan("com.tourism.service") })
public class AppConfig {

	@Autowired
	Environment environment;

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {

		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();

		Properties properties = new Properties();
		properties.put(DRIVER, environment.getProperty("spring.datasource.driverClassName"));
		properties.put(URL, environment.getProperty("spring.datasource.url"));
		properties.put(USER, environment.getProperty("spring.datasource.username"));
		properties.put(PASS, environment.getProperty("spring.datasource.password"));

		properties.put(SHOW_SQL, environment.getProperty("spring.jpa.show-sql"));
		properties.put(HBM2DDL_AUTO, environment.getProperty("spring.jpa.hibernate.ddl-auto"));

		properties.put(C3P0_MIN_SIZE, environment.getProperty("hibernate.c3p0.min_size"));
		properties.put(C3P0_MAX_SIZE, environment.getProperty("hibernate.c3p0.max_size"));
		properties.put(C3P0_ACQUIRE_INCREMENT, environment.getProperty("hibernate.c3p0.acquire_increment"));
		properties.put(C3P0_TIMEOUT, environment.getProperty("hibernate.c3p0.timeout"));
		properties.put(C3P0_MAX_STATEMENTS, environment.getProperty("hibernate.c3p0.max_statements"));

		factoryBean.setHibernateProperties(properties);
		factoryBean.setPackagesToScan("com.tourism.model");

		return factoryBean;
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager transactionManager=new HibernateTransactionManager();
		transactionManager.setSessionFactory(getSessionFactory().getObject());
		return transactionManager;
		
	}

}
