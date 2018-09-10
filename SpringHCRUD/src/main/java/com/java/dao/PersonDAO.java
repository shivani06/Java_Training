package com.java.dao;

import java.util.List;

import com.java.model.Person;

public interface PersonDAO {
	
	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonbyId(int id);
	public void removePerson(int id);
	

}
