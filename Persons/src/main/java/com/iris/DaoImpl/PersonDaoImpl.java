package com.iris.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iris.Dao.PersonDao;
import com.iris.Models.Person;
@Repository("PersonDao")
public class PersonDaoImpl implements PersonDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public List<Person> getAllPersons() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from com.iris.Models.Person");
		return query.list();
	
	}





	public Person getPersonById(int id) {
		Session session=sessionFactory.getCurrentSession();
		Person p=session.get(Person.class, id);
		
		
		return p;
	}


	public boolean deletePerson(int personId) {
		Session session=sessionFactory.getCurrentSession();
		Person per=session.get(Person.class, personId);
		session.delete(per);
		return true;
	}





	public boolean addPerson(Person pObj) {
		Session session=sessionFactory.getCurrentSession();
		session.save(pObj);
		
		return true;
	}





	public boolean validatePerson(int id, String password) {
		// TODO Auto-generated method stub
		return false;
	}





	

	


	

	

	
}
