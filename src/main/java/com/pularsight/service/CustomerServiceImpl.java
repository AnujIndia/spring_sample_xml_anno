package com.pularsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pularsight.model.Customer;
import com.pularsight.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	//Member level Auto wired 
	///@Autowired
	private CustomerRepository customerRepository;
	
	
	
	/*//constructor level Auto wired 
	//@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		System.out.println("We are using the Constructor Injection");
		this.customerRepository = customerRepository;
	}
	*/

	//setter level Auto wired 
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Setter injection");
		this.customerRepository = customerRepository;
	}


	/* (non-Javadoc)
	 * @see com.pularsight.service.CustomerService#findAll()
	 */
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
