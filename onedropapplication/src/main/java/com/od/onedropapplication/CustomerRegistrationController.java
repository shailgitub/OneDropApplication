package com.od.onedropapplication;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rgstr")
public class CustomerRegistrationController {

//	@Autowired
//	private CustomerRegistrationService customerRegistrationService;
//
//	@GetMapping("/customer9")
//	public List<Customer> getCustomerList() {
//		return customerRegistrationService.getCustomerListService();
//	}
//
//	@GetMapping("/customer9/{id}")
//	public Customer getCustomerById(@PathVariable(value = "id") int userId) {
//
//		return customerRegistrationService.getCustomerByIdService(userId);
//	}
//
//	@PostMapping(value= "/save9" )
//	//public ResponseEntity<Object> saveCustomer(@RequestBody Customer customer) {
//		public String saveCustomer(@RequestBody Customer customer) {
////		Customer customer= new Customer();
////		customer.setId(0);
////		customer.setContact( "973838852");
////		customer.setEmail("mail2shail@gmail.com");
////		customer.setName("shail");
//		
//		
//		Customer customer2=customerRegistrationService.saveCustomerService(customer);
//		 //URI location = 
//		//URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(customer2.getId()).toUri();
//		
//		//return ResponseEntity.created(location).build();
//		return "data saved with id:" +customer.getId()+"and Name: "+customer.getName();
//	}
	
	@GetMapping("/order")
	public String getOrderInfo() {
		return "This can be first order";
	}
	
}

