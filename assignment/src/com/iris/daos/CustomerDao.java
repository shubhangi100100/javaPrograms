package com.iris.daos;
import java.util.List;

import com.iris.models.Customer;

public interface CustomerDao {

	public boolean registerCustomer(Customer cust) throws Exception;
	public Customer validateCustomer(int id, String password) throws Exception;
	public List<Customer> getAllCustomers() throws Exception;
	public boolean deleteCustomer(int id) throws Exception;
	public boolean updateCustomer(Customer cust) throws Exception;
	
	
}
