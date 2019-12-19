package com.assignment2.Daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.assignment2.Dao.CustomerDao;
import com.assignment2.models.Customer;
import com.assignment2.utility.ConnectionProvider;

public class CustomerDaoImpl implements CustomerDao {
	Connection conn=ConnectionProvider.getConn();

	@Override
	public boolean registerCustomer(Customer cust) throws Exception {
		PreparedStatement ps=conn.prepareStatement("insert into Customer1 values(?,?,?,?,?,?,'customer')");
		ps.setInt(1,cust.getCustomerId());
		ps.setString(2,cust.getCustomerName());
		ps.setString(3,cust.getGender());
		ps.setString(4,cust.getEmailAddress());
		ps.setString(5,cust.getPassword());
		ps.setString(6,cust.getCity());
		
		int i=ps.executeUpdate();
		if(i!=0){
			return true;
		}
		return false;
	}

	@Override
	public Customer validateCustomer(int id, String password) throws Exception {
		PreparedStatement ps=conn.prepareStatement("select * from customer1 where id=? and password=?");
		ps.setInt(1, id);
		ps.setString(2,password);
		
		ResultSet rs= ps.executeQuery();
		if(rs.next())
		{
			int Id= rs.getInt(1);
			String name= rs.getString(2);
			String gender= rs.getString(3);
			String email= rs.getString(4);
			String Password= rs.getString(5);
			String city= rs.getString(6);
			String role=rs.getString(7);
			
			
			
			Customer cus=new Customer(id,name,gender,email,Password,city);
			cus.setRole(role);
			return cus;
		}
		
		
		
		
		  return null;
	}

	@Override
	public List<Customer> getAllCustomers() throws Exception {
		
		List<Customer> clist= new ArrayList<>();
		
		PreparedStatement ps=conn.prepareStatement("select * from Customer where role='customer'");
		ResultSet rs=ps.executeQuery();
		
			while(rs.next())
			{
				int id= rs.getInt(1);
				String name= rs.getString(2);
				String gender= rs.getString(3);
				String email= rs.getString(4);
				String Password= rs.getString(5);
				String city= rs.getString(6);
				String role= rs.getString(7);
			
				Customer cust=new Customer();
				
				cust.setCustomerId(id);
				cust.setCustomerName(name);
				cust.setGender(gender);
				cust.setEmailAddress(email);
				cust.setPassword(Password);
				cust.setCity(city);
				cust.setRole(role);
			
				clist.add(cust);
				
			}
			
			System.out.println("cList : "+clist);
			return clist;
	}
	
	
	}
	
	


