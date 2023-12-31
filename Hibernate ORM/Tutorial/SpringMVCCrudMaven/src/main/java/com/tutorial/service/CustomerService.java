package com.tutorial.service;

import java.util.List;

import com.tutorial.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	public void saveCusetomer(Customer customer); 
	public Customer getCustomer(int customeId);
	public void deleteCustomer(int customeId);
	public List<Customer> searchCustomers(String email);
	public boolean checkLogin(String email,String password);
}