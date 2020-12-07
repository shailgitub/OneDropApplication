package com.od.onedropapplication.customer.service;

import java.util.List;

import com.od.onedropapplication.customer.entity.Customer;

public interface CustomerRegistrationService {
	List<Customer> getCustomerListService();

	Customer getCustomerByIdService(int id);

	public Customer saveCustomerService(Customer customer);

	void deleteCustomerService(int id);
}
