package com.od.onedropapplication.retailer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.od.onedropapplication.retailer.entity.Retailer;

public interface RetailerRegistrationRepo extends JpaRepository<Retailer, Integer> {

}
