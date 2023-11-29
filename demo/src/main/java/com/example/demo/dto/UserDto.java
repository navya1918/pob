package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class UserDto {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String emailid;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public UserDto(Long id, String firstName, String lastName, String emailid) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailid = emailid;
	}
	public UserDto() {
		super();
	}
	
	

}
