package com.abk.customer.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abk.customer.entity.CustomerEntity;
import com.abk.customer.model.Customer;
import com.abk.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/customers")
	public Customer saveCustomer(@RequestBody Customer customer) throws ParseException {
		return customerService.saveCustomer(customer);
	}

	@GetMapping("/customers")
	public List<CustomerEntity> fetchCustomerList() {
		return customerService.getCustomerDetails();
	}

	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer) throws ParseException {
		return customerService.updateCustomerDetails(customer);
	}

	@DeleteMapping("/customers/{id}")
	public String deleteCustomerById(@PathVariable("id") Long id) {
		return customerService.deleteCustomer(id);

	}

}
