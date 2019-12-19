package com.iris.daosImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.iris.dao.UserDao;
import com.iris.models.User;
import com.iris.utility.SessionFactoryProvider;

public class UserDaoImpl implements UserDao {
	SessionFactory sf=SessionFactoryProvider.getSessionFactory();
	
	public boolean saveUser(User uobj) {
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	session.save(uobj);
	tx.commit();
	session.close();
	
	
	return false;
	}

	

	public User getUser(int id) {
		try {
		Session session=sf.openSession();
		User uobj=session.get(User.class, id);
		session.close();
		
		return uobj;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}



	public List<User> getAllUsers() {
		Session session=sf.openSession();
		Query<User> query= session.createQuery("from com.iris.models.User");
		List<User> ulist=query.list();
		return ulist;
		
		
	}
	
}
