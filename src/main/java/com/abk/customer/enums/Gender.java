package com.abk.customer.enums;

public enum Gender {
	M(0), F(1);

	private final Integer value;

	Gender(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

}
