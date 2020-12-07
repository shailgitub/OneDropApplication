package com.od.onedropapplication.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.od.onedropapplication.entity.Customer;

public interface CustomerRegistrationRepo extends JpaRepository<Customer, Integer> {

}



