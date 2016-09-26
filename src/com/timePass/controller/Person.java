package com.timePass.controller;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.timePass.entity.CommonColumns;

@Entity
@Table(name="PERSON")
public class Person extends CommonColumns implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="person_id")
	private long personId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email_id", nullable=false)
	private String emailId;

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public Person(long personId, String name, String emailId) {
		super();
		this.personId = personId;
		this.name = name;
		this.emailId = emailId;
	}
	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", emailId="
				+ emailId + "]";
	}

}
