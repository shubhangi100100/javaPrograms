package com.iris.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.iris.Dao.UserDao;
import com.iris.models.User;
import com.eshop.utility.SessionFactoryProvider;

public class UserDaoImpl implements UserDao{

	SessionFactory sf=SessionFactoryProvider.getSessionFactory();
		public boolean saveUser(User uobj) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(uobj);
		tx.commit();
		session.close();
		
		                                                                                                                                                                                                                                                                                        
		return false;
		
		
	}

}
