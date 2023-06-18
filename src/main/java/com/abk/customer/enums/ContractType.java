package com.abk.customer.enums;

public enum ContractType {
	FULLTIME(0), PARTTIME(1);

	private final Integer value;

	ContractType(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

}
