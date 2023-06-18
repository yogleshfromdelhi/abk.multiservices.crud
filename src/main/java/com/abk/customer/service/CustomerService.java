package com.abk.customer.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abk.customer.entity.CustomerEntity;
import com.abk.customer.model.Customer;

@Service
public interface CustomerService {

	List<CustomerEntity> getCustomerDetails();

	String deleteCustomer(Long id);

	Customer saveCustomer(Customer customer) throws ParseException;

	Customer updateCustomerDetails(Customer customer) throws ParseException;

}
