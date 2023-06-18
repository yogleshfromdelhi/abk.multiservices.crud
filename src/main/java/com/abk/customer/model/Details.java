package com.abk.customer.model;

import com.abk.customer.enums.Gender;

public class Details {

	private Gender sex;
	
	private String dob;
	private String nativeV;

	public Details() {
		super();
	}

	public Gender getSex() {
		return sex;
	}

	public void setSex(Gender sex) {
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

	public Details(Gender sex, String dob, String nativeV) {
		this.sex = sex;
		this.dob = dob;
		this.nativeV = nativeV;
	}

	@Override
	public String toString() {
		return "Details [sex=" + sex + ", dob=" + dob + ", nativeV=" + nativeV + "]";
	}

}
