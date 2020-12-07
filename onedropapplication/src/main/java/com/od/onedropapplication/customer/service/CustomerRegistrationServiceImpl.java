package com.od.onedropapplication.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.od.onedropapplication.customer.repo.CustomerRegistrationRepo;
import com.od.onedropapplication.entity.Customer;

@Service
public class CustomerRegistrationServiceImpl implements CustomerRegistrationService {

	@Autowired
	private CustomerRegistrationRepo customerRegistrationRepo;

	@Transactional
	@Override
	public List<Customer> getCustomerListService() {
		return customerRegistrationRepo.findAll();

	}

	@Transactional
	@Override
	public Customer getCustomerByIdService(int id) {

		return customerRegistrationRepo.getOne(id);
	}

	@Transactional
	@Override
	public Customer saveCustomerService(Customer customer) {

		return customerRegistrationRepo.save(customer);
	}

	@Transactional
	@Override
	public void deleteCustomerService(int id) {

	}
}
