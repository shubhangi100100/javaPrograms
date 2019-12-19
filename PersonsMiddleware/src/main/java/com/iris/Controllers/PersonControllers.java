package com.iris.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iris.Models.Person;
import com.iris.Service.PersonService;

@Controller
@CrossOrigin("http://localhost:4200")
public class PersonControllers {
	
	@Autowired
	PersonService personServiceObj;
	
	/**
	 * @ResponseBody
	 * @return

	@RequestMapping(value="/getAllPersons",method=RequestMethod.GET)
	@CrossOrigin("http://localhost:4200")
	public List<Person> getAllPersons(){
		return personServiceObj.getAllPersons();
		
		
	}
	
	private static final List<Person> List = null;
	
	@DeleteMapping(value="/deletePerson")
	@CrossOrigin("http://localhost:4200")
	public boolean deletePerson(@RequestBody int personId) {
		return personServiceObj.deletePerson(personId);
		
	}
		 */
	
	@GetMapping("/persons")
	public ResponseEntity<?> getAllPersons(){
	List<Person> pList= personServiceObj.getAllPersons();
	if(pList.size()!=0) {
		return new ResponseEntity<List<Person>>(pList, HttpStatus.OK);

	}
	else {
		return new ResponseEntity<String>("No person found", HttpStatus.OK);
	}
	
	
	}
	
	
	@PostMapping("/persons")
	public ResponseEntity<?> addPerson(@RequestBody Person pObj){
		boolean b= personServiceObj.addPerson(pObj);
		if(b)
		{
			return new ResponseEntity<String>("Person Added", HttpStatus.OK);
			
		}
		else
		{
			return new ResponseEntity<String>("Person could not be added", HttpStatus.OK);
		}
		
	}
	
	@DeleteMapping("/persons/{personId}")
	public ResponseEntity<?> deletePerson(@PathVariable("personId") int personId){
		boolean a= personServiceObj.deletePerson(personId);
		if(a) {
			return new ResponseEntity<String>("Person deleted", HttpStatus.OK);
			
		}
		else
		{
			return new ResponseEntity<String>("Cannot delete", HttpStatus.OK);
		}
		
		
		
	}
}
