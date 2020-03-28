package com.niit.demo.crm.dao;

import java.util.List;

import com.niit.demo.crm.model.Customer;

public interface CustomerDAO {

	public void saveCustomer(Customer theCustomer);
	
	public List<Customer> getCustomers();
}
