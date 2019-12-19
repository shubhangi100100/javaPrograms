package com.iris.daosImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iris.daos.UserDao;
import com.iris.models.User;

@Repository("UserDao")
public class UserDaoImpl implements UserDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean registerUser(User uObj) {
	Session session	= sessionFactory.getCurrentSession();
		session.saveOrUpdate(uObj);
	
		
		return true;
	}

	public User validateUser(int Id, String password) {
		Session session	= sessionFactory.getCurrentSession();
		User uObj= session.get(User.class, Id);
		if(uObj!=null) {
			if(uObj.getPassword().equals(password)) {
				return uObj;
				
			}
		}
		return null;
	}

	public List<User> getAllUsers() {
		Session session= sessionFactory.getCurrentSession();
		Query q=session.createQuery("from com.iris.models.User where role='user'");
		List<User> uList =q.list();
		
		return uList;
	}

	
		
		public boolean deleteUser(User uObj) {
			
				Session session=sessionFactory.getCurrentSession();
				session.delete(uObj);
				return true;
			
				

		
	
	}

		public boolean updateUser(User uObj) {
			Session session=sessionFactory.getCurrentSession();
			session.update(uObj);
		
			return false;
		}

		public User getUserById(int id) {
			
			Session session=sessionFactory.getCurrentSession();
			User uObj= session.get(User.class,id);
			return uObj;
		}
	

}
