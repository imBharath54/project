package com.project.backend.dto;

import com.project.backend.entity.User;

public class UserDto {
	private String firstName;
	private String lastName;
	private String email;
	private Long mobileNo;
	private String city;
	private String password;
	
	public UserDto() {
		
	}
	
	
	public UserDto(String firstName, String lastName, String email, Long mobileNo, String city, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.city = city;
		this.password = password;
	}
	
	public UserDto(User user) {
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.email = user.getEmail();
		this.mobileNo = user.getMobileNo();
		this.city = user.getCity();
		this.password = user.getPassword();
		
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
