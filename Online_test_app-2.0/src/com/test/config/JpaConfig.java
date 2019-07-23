package com.test.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@EnableJpaRepositories(basePackages= {"com.test"})
public class JpaConfig {
	
	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory() {
		LocalEntityManagerFactoryBean factorybean= new LocalEntityManagerFactoryBean();
		factorybean.setPersistenceUnitName("exam");
		System.out.println("2) i am in jpacongif localentity manager factory bean");
		return factorybean;
	}
	
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
			JpaTransactionManager transactionManager=new JpaTransactionManager();
			transactionManager.setEntityManagerFactory(entityManagerFactory);
			System.out.println("3)I am in JpaConfig");
			return transactionManager;
	}
	

}
