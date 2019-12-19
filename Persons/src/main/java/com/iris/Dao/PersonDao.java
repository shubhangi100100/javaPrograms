package com.iris.Dao;

import java.util.List;

import com.iris.Models.Person;

public interface PersonDao {

	
	public List<Person> getAllPersons();
	public boolean deletePerson(int personId);
	public Person getPersonById(int id);
	public boolean addPerson(Person pObj);
	public boolean validatePerson(int id,String password);
	
	
	
	
}
