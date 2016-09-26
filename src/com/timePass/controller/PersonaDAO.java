package com.timePass.controller;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface PersonaDAO {
	public boolean save(Person person);
	public boolean update(Person person);
	public boolean delete(Person person);
	
	public List<Person> getPersonById(String personId);
}
