package com.od.onedropapplication.retailer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.od.onedropapplication.retailer.entity.Retailer;
import com.od.onedropapplication.retailer.service.RetailerRegistrationService;

@RestController
@RequestMapping("/retailer")
public class RetailerRegistrationController {

	@Autowired
	private RetailerRegistrationService retailerRegistrationService;

	@GetMapping("/rtlList")
	public List<Retailer> getRetailerList() {
		List<Retailer> retailerList= null;
		retailerList=retailerRegistrationService.getRetailerListService();
		return retailerList;
	}

	@GetMapping("/rtlById/{id}")

	public Retailer getRetailerById(@PathVariable(value = "id") int userId) {

		return retailerRegistrationService.getRetailerByIdService(userId);
	}

	@PostMapping(value = "/saveRtl")
	public String saveRetailer(@RequestBody Retailer retailer) {
		// Retailer.setRetailerAddress(Retailer.getRetailerAddress());
		retailer = retailerRegistrationService.saveRetailerService(retailer);
		return "data saved with below data:\n id:" + retailer.getRetailerId() + "\n Name: "
				+ retailer.getRetailerName();
	}

	@GetMapping("/order")
	public String getOrderInfo() {
		return "This can be first order";
	}

}
