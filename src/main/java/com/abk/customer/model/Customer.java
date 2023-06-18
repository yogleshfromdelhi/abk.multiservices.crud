package com.abk.customer.model;

import com.abk.customer.enums.ContractType;

public class Customer {

	private String name;
	private String accountType;
	private String businessRequirements;
	private ContractType contractType;
	private Details details = new Details();

	public Customer() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBusinessRequirements() {
		return businessRequirements;
	}

	public void setBusinessRequirements(String businessRequirements) {
		this.businessRequirements = businessRequirements;
	}

	public ContractType getContractType() {
		return contractType;
	}

	public void setContractType(ContractType contractType) {
		this.contractType = contractType;
	}

	public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}

	public Customer(String name, String accountType, String businessRequirements, ContractType contractType,
			Details details) {
		this.name = name;
		this.accountType = accountType;
		this.businessRequirements = businessRequirements;
		this.contractType = contractType;
		this.details = details;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", accountType=" + accountType + ", businessRequirements="
				+ businessRequirements + ", contractType=" + contractType + ", details=" + details + "]";
	}

}
