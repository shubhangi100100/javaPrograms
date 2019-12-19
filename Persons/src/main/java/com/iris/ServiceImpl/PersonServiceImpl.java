package com.iris.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iris.Dao.PersonDao;
import com.iris.Models.Person;
import com.iris.Service.PersonService;
@Service("personService")
@Transactional
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	PersonDao personDaoObj;
	
	public List<Person> getAllPersons() {
	
		return personDaoObj.getAllPersons();
	}

	public boolean deletePerson(int personId) {
		
		return personDaoObj.deletePerson(personId);
	}

	public Person getPersonById(int id) {
		
		return personDaoObj.getPersonById(id);
	}

	public boolean addPerson(Person pObj) {
		
		return personDaoObj.addPerson(pObj);
	}

	public boolean validatePerson(int id, String password) {
		
		return personDaoObj.validatePerson(id, password);
	}

	

	
}
