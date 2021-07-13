package com.assignment.app.Util;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class HibernateUtilConfig {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Bean
	public SessionFactory getFactory() {
		
		if(entityManagerFactory.unwrap(SessionFactory.class) == null) {
			throw new NullPointerException("Factory is not  a Hibernate Factory");
		}
		
		return entityManagerFactory.unwrap(SessionFactory.class);
	}

}
