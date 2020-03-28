package com.niit.demo.crm.service;

import java.util.List;

import com.niit.demo.crm.model.Customer;

public interface CustomerService {

	public void saveCustomer(Customer theCustomer);
	
	public List<Customer> getCustomers();
}
