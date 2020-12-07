package com.od.onedropapplication.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.od.onedropapplication.customer.entity.Customer;
import com.od.onedropapplication.customer.entity.CustomerAddress;
import com.od.onedropapplication.customer.service.CustomerRegistrationService;

@RestController
@RequestMapping("/custReg")
public class CustomerRegistrationController {

	@Autowired
	private CustomerRegistrationService customerRegistrationService;

	@GetMapping("/cstAll")
	public List<Customer> getCustomerList() {
		return customerRegistrationService.getCustomerListService();
	}

	@GetMapping("/cstById/{id}")

	public Customer getCustomerById(@PathVariable(value = "id") int userId) {

		return customerRegistrationService.getCustomerByIdService(userId);
	}

	@PostMapping(value = "/cstSave")
	public String saveCustomer(@RequestBody Customer customer) {
		//customer.setCustomerAddress(customer.getCustomerAddress());
		customer = customerRegistrationService.saveCustomerService(customer);
		return "data saved with below data:\n id:" + customer.getId() + "\n Name: " + customer.getName();
	}

	@PostMapping(value = "/save121")
	public String saveCustomer121(@RequestBody Customer customer) {
		Customer customer2 = customerRegistrationService.saveCustomerService(customer);
		// URI location =
		// URI location =
		// ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(customer2.getId()).toUri();

		// return ResponseEntity.created(location).build();
		return "data saved with below data:\n id:" + customer.getId() + "\n Name: " + customer.getName();
	}

	@GetMapping("/order")
	public String getOrderInfo() {
		return "This can be first order";
	}

}
