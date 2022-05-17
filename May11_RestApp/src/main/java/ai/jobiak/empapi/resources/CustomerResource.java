package ai.jobiak.empapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ai.jobiak.empapi.model.Customer;
import ai.jobiak.empapi.service.CustomerService;
@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/customers")
public class CustomerResource 
{
	@Autowired
	CustomerService serv;
	@CrossOrigin(origins= {"*"},maxAge=4800,allowCredentials="false")
	@GetMapping(value ="/display",produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Customer>showAll() {
		System.out.println("request received.......");
		return serv.getAll();
	}
	@GetMapping(value ="/customer",produces= MediaType.APPLICATION_JSON_VALUE)
	public Customer showCatalog() {
		Customer customer = new Customer();
		customer.setId(100001L);
		customer.setName("Hemima");
		customer.setBalance(9999);
		 
		return customer;
	}
	@PostMapping(value ="/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_JSON_VALUE)
	public Customer newCustomer(@RequestBody Customer cus) {
		Customer ref = serv.addCustomer(cus);
		return ref;
	}
	@PutMapping(value ="/modify",consumes = MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_JSON_VALUE)
	public Customer modifyCustomer(@RequestBody Customer cus) {
		Customer ref = serv.modifyCustomer(cus);
		return ref;
	}
	public void removeCustomer(@PathVariable Long cusId) {

		serv.removeCustomer(cusId);
	}
}
