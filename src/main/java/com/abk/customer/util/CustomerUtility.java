package com.abk.customer.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.abk.customer.entity.CustomerEntity;
import com.abk.customer.enums.ContractType;
import com.abk.customer.enums.Gender;
import com.abk.customer.model.Customer;

public class CustomerUtility {

	public static CustomerEntity convertToCustomerEntity(Customer customer) throws ParseException {
		CustomerEntity customerEntity = new CustomerEntity();
		if (customer != null) {
			customerEntity.setAccountType(customer.getAccountType());
			customerEntity.setBusinessRequirements(customer.getBusinessRequirements());
			customerEntity.setContractType(customer.getContractType().name());
			customerEntity.setName(customer.getName());
			if (customer.getDetails() != null) {
				String dateValidate = "01-01-2002";
				Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(dateValidate);
				Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(customer.getDetails().getDob());
				if (date1.before(date2)) {
					customerEntity.setDob(customer.getDetails().getDob());
				} else {
					throw new NullPointerException("Date should be less than " + dateValidate);
				}
				customerEntity.setNativeV(customer.getDetails().getNativeV());
				customerEntity.setSex(customer.getDetails().getSex().name());
			}

		}
		return customerEntity;
	}

	public static Customer convertToCustomer(CustomerEntity customerEntity) throws ParseException {
		Customer customer = new Customer();
		if (customerEntity != null) {
			customer.setAccountType(customerEntity.getAccountType());
			customer.setBusinessRequirements(customerEntity.getBusinessRequirements());
			customer.setContractType(ContractType.valueOf(customerEntity.getContractType()));
			customer.setName(customerEntity.getName());
			customer.getDetails().setSex(Gender.valueOf(customerEntity.getSex()));
			customer.getDetails().setNativeV(customerEntity.getNativeV());
			customer.getDetails().setDob(customerEntity.getDob());

		}
		return customer;

	}

}
