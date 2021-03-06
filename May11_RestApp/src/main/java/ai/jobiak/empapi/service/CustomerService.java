package ai.jobiak.empapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ai.jobiak.empapi.model.Customer;
import ai.jobiak.empapi.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repo;
	
	public Customer addCustomer(Customer cus) {
		Customer ref = repo.save(cus);
		return ref;
	}
	public Customer modifyCustomer(Customer cus) {
		//Mobile ref = repo.save(mobile);
		return repo.save(cus);
	}
	public void removeCustomer(Long cusid)
	{
		repo.deleteById(cusid);
	}
	public List<Customer>getAll()
	{
		return repo.findAll();
	}
}
