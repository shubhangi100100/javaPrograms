package com.eshop.Test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eshop.Config.DBconfig;
import com.eshop.Daos.ProductDao;
import com.eshop.OnlineStore_Backend.Product;

import  static java.lang.System.out;
import static org.junit.Assert.*;

import java.util.List;

public class ProductTest {

	private static ProductDao productDaoObj;
	
	@BeforeClass
	public static void init() {
		out.println("i am init start");
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(DBconfig.class);
		productDaoObj=context.getBean(ProductDao.class, "ProductDao");
		
   	 	out.println("I m in init - end");
		
	}
	
	@Test
	@Ignore
	public void addProductTest(){
		Product p=new Product();
		p.setProductName("Dress");
		p.setPrice(2500);
		
		boolean r=productDaoObj.addProduct(p);
		assertTrue("Problem in Adding Product", r);
	}
	
	@Test
	@Ignore
	public void getProductByIdTest() {
		Product pObj=productDaoObj.getProductById(21);
		assertNotNull("Product with given id doesnt exist", pObj);
		
	}
	@Test
	@Ignore
	public void getAllProductsTest(){
		List<Product> pList=productDaoObj.getAllProducts();
		Assert.assertNotEquals("Not Products Found...", pList.size(), 0);
	}
	
	
}
