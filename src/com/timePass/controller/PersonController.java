package com.timePass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.timePass.services.IProductTypeService;

@Controller
public class PersonController{
 
	
	@Autowired
	IProductTypeService productTypeService;
	@Autowired PersonaDAO personDAO;
	
	@RequestMapping("/welcome.htm")
	public ModelAndView helloWorld(){
 
		ModelAndView model = new ModelAndView("person");
		model.addObject("msg", "Vivek Sharma");
 
		return model;
	}
	
	@RequestMapping("/create")
	public  String createPerson(@RequestParam MultiValueMap  parameters){
	ModelAndView model = new ModelAndView("person");
	Person  person = new Person();
	person.setName(parameters.get("name").toString());
	person.setEmailId(parameters.get("emailId").toString());
	//person.setPersonId("202");
	//person.setName("Vivek Sharma");
	//person.setEmailId("vivek.sharma@lt.com");
	personDAO.save(person);
	return "person";
	}
}
