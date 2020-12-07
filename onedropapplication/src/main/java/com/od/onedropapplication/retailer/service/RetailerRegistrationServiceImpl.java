package com.od.onedropapplication.retailer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.od.onedropapplication.entity.Retailer;
import com.od.onedropapplication.retailer.repo.RetailerRegistrationRepo;

@Service
public class RetailerRegistrationServiceImpl implements RetailerRegistrationService {

	@Autowired
	private RetailerRegistrationRepo retailerRegistrationRepo;

	@Transactional
	@Override
	public List<Retailer> getRetailerListService() {
		return retailerRegistrationRepo.findAll();

	}

	@Transactional
	@Override
	public Retailer getRetailerByIdService(int id) {

		return retailerRegistrationRepo.getOne(id);
	}

	@Transactional
	@Override
	public Retailer saveRetailerService(Retailer retailer) {

		return retailerRegistrationRepo.save(retailer);
	}

	@Transactional
	@Override
	public void deleteRetailerService(int id) {

	}
}
