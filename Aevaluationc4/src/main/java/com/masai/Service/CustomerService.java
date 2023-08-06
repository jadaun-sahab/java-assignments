package com.masai.Service;

import java.util.List;

import com.masai.Exception.CustomerException;

import com.masai.model.Customer;

public interface CustomerService {
	public Customer createCustomer(Customer customer);
	public Customer getCustomerById(Integer id) throws CustomerException;
	public List<Customer> getAllCustomers() throws CustomerException;
	public Customer deleteCustomer(Integer id);
}
