package com.abk.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private String name;
	private String accountType;
	private String businessRequirements;
	private String contractType;
	private String sex;
	private String dob;
	private String nativeV;

	public CustomerEntity() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getNativeV() {
		return nativeV;
	}

	public void setNativeV(String nativeV) {
		this.nativeV = nativeV;
	}

	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name + ", accountType=" + accountType
				+ ", businessRequirements=" + businessRequirements + ", contractType=" + contractType + ", sex=" + sex
				+ ", dob=" + dob + ", nativeV=" + nativeV + "]";
	}

}