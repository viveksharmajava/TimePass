package com.timePass.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtils {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	

	private static synchronized SessionFactory buildSessionFactory(){
		 Configuration configure = new Configuration().addResource("\\hibernate.cfg.xml").configure();
		 return configure.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
