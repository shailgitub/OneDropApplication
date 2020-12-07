package com.od.onedropapplication.retailer.service;

import java.util.List;

import com.od.onedropapplication.entity.Retailer;

public interface RetailerRegistrationService {

	List<Retailer> getRetailerListService();

	Retailer getRetailerByIdService(int id);

	public Retailer saveRetailerService(Retailer retailer);

	void deleteRetailerService(int id);

}
