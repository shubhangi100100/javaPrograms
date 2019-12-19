package com.eshop.DaosImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eshop.Daos.ProductDao;
import com.eshop.OnlineStore_Backend.Product;

@Repository
@Transactional
public class ProductDaosImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addProduct(Product pObj) {
		Session session=sessionFactory.getCurrentSession();
		session.persist(pObj);
		return true;
	}

	public boolean deleteProduct(Product pObj) {
		
		Session session=sessionFactory.getCurrentSession();
		session.delete(pObj);
		return true;
	}

	public boolean updateProduct(Product pObj) {
		Session session=sessionFactory.getCurrentSession();
		session.update(pObj);
		return true;
	}

	public Product getProductById(int pId) {
		
		Session session=sessionFactory.getCurrentSession();
		Product pro=session.get(Product.class,pId);
		return pro;
		
	}

	public List<Product> getAllProducts() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from com.eshop.OnlineStore_Backend.Product");
		return query.list();
		
	
	}

}
