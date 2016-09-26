package com.timePass.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.timePass.util.HibernateUtils;
@Component
public class PersonaDAOImpl    implements PersonaDAO {
	@PersistenceContext
	private EntityManager manager;
	@Override
	@Transactional(readOnly=false)
	public boolean save(Person person) {
	
		 Session session= HibernateUtils.getSessionFactory().openSession();
		Transaction trans= session.beginTransaction();
		 session.save(person);
		 trans.commit();
		 session.close();
		//manager.persist(person);
		return true;
	}

	@Override
	public List<Person> getPersonById(String personId) {
		List<Person> employees = manager.createQuery("Select a From Person a", Person.class).getResultList();
		return employees;
	}

	@Override
	public boolean update(Person person) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Person person) {
		// TODO Auto-generated method stub
		return false;
	}

}
