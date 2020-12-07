import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.od.onedropapplication.retailer.entity.Retailer;
import com.od.onedropapplication.retailer.entity.RetailerAddress;
import com.od.onedropapplication.retailer.service.RetailerRegistrationService;

@RestController
@RequestMapping("/rtlrReg")
public class RetailerRegistrationController {

	@Autowired
	private RetailerRegistrationService retailerRegistrationService;

	@GetMapping("/rtlrAll")
	public List<Retailer> getRetailerList() {
		return retailerRegistrationService.getRetailerListService();
	}

	@GetMapping("/rtlrById/{id}")

	public Retailer getRetailerById(@PathVariable(value = "id") int userId) {

		return retailerRegistrationService.getRetailerByIdService(userId);
	}

	@PostMapping(value = "/rtlrSave")
	public String saveRetailer(@RequestBody Retailer retailer) {
		//retailer.setRetailerAddress(retailer.getRetailerAddress());
		retailer = retailerRegistrationService.saveRetailerService(retailer);
		return "data saved with below data:\n id:" + retailer.getRetailerId() + "\n Name: " + retailer.getRetailerName();
	}

	@PostMapping(value = "/save121")
	public String saveRetailer121(@RequestBody Retailer retailer) {
		Retailer retailer2 = retailerRegistrationService.saveRetailerService(retailer);
		// URI location =
		// URI location =
		// ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(retailer2.getId()).toUri();

		// return ResponseEntity.created(location).build();
		return "data saved with below data:\n id:" + retailer.getRetailerId() + "\n Name: " + retailer.getRetailerName();
	}

	@GetMapping("/order")
	public String getOrderInfo() {
		return "This can be first order";
	}

}
