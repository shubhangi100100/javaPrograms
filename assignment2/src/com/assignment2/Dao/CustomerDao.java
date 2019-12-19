package com.assignment2.Dao;

import java.util.List;

import com.assignment2.models.Customer;

public interface CustomerDao {
	public boolean registerCustomer(Customer cust) throws Exception;
	public Customer validateCustomer(int id, String password) throws Exception;
	public List<Customer> getAllCustomers() throws Exception;
	
}
