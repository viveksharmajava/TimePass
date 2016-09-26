package com.timePass.controller;

import org.springframework.beans.factory.annotation.Autowired;

public class PersonService {
	@Autowired PersonaDAO personDAO;
	
	public void createPerson(Person person){
		personDAO.save(person);
	}
}
