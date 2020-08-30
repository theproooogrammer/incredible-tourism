package com.tourism.config;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.FactoryBean;
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
		System.out.println("SPRING MVC");
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();

		Properties properties = new Properties();
		properties.put(DRIVER, environment.getProperty("spring.datasource.driverClassName"));
		properties.put(URL, environment.getProperty("spring.datasource.url"));
		properties.put(USER, environment.getProperty("spring.datasource.username"));
		properties.put(PASS, environment.getProperty("spring.datasource.password"));

		System.out.println("SPRING MVC");
		System.out.println(environment.getProperty("spring.datasource.driverClassName"));
		System.out.println(environment.getProperty("spring.datasource.url"));
		System.out.println(environment.getProperty("spring.datasource.username"));
		System.out.println(environment.getProperty("spring.datasource.password"));
		System.out.println("End");

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
		System.out.println("SPRING MVC");
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getSessionFactory().getObject());
		try {
			transactionManager.setSessionFactory(((FactoryBean<SessionFactory>) dataSource()).getObject());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return transactionManager;

	}

	@Bean
	public BasicDataSource dataSource() throws URISyntaxException {
		URI dbUri = new URI(System.getenv("DATABASE_URL"));

		String username = dbUri.getUserInfo().split(":")[0];
		String password = dbUri.getUserInfo().split(":")[1];
		String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath()
				+ "?sslmode=require";

		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl(dbUrl);
		basicDataSource.setUsername(username);
		basicDataSource.setPassword(password);

		return basicDataSource;
	}

}
