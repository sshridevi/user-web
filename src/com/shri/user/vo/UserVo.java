package com.shri.user.vo;


public class UserVo {
	private int id;
	private String  firstName;
	private String	lastName;
	private String  middleName;
	public UserVo() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setFirstName(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

}
