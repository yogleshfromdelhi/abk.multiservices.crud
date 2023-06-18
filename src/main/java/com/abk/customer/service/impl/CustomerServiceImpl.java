package com.abk.customer.service.impl;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abk.customer.entity.CustomerEntity;
import com.abk.customer.model.Customer;
import com.abk.customer.repository.CustomerRepository;
import com.abk.customer.service.CustomerService;
import com.abk.customer.util.CustomerUtility;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<CustomerEntity> getCustomerDetails() {
		List<CustomerEntity> listResponse = customerRepository.findAll();
		return listResponse;
	}

	@Override
	public String deleteCustomer(Long id) {
		String response = "";
		try {
			customerRepository.deleteById(id);
			response = "Deleted SuccessFully";
		} catch (Exception e) {
			response = "Unable to Delete : " + e.getMessage();
		}
		return response;
	}

	@Override
	public Customer saveCustomer(Customer customer) throws ParseException {

		CustomerEntity customerEntity = CustomerUtility.convertToCustomerEntity(customer);
		
		CustomerEntity savedEntity = customerRepository.save(customerEntity);
		Customer savedCustomer = CustomerUtility.convertToCustomer(savedEntity);
		return savedCustomer;

	}

	@Override
	public Customer updateCustomerDetails(Customer customer) throws ParseException {
		CustomerEntity customerEntity = CustomerUtility.convertToCustomerEntity(customer);
		CustomerEntity dbEntity = customerRepository.findByName(customerEntity.getName());
		Long id = dbEntity.getId();
		customerEntity.setId(id);
		CustomerEntity updatedEntity = customerRepository.save(customerEntity);
		Customer savedCustomer = CustomerUtility.convertToCustomer(updatedEntity);
		return savedCustomer;

	}

}
