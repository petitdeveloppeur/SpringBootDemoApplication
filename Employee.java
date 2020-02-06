package com.howtodoinjava.demo.model;


public class Employee {

	public Employee() {
		
	}
public Employee(Integer id,String Firstname, String Lastname, String email ) {
	
	super();
	this.id = id;
	this.Firstname = Firstname;
	this.Lastname = Lastname;
	this.email = email;
}
	
	private Integer id;
	private String Firstname;
	private String Lastname;
	private String email;
	
	// Getters and Setters
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		return "Employee [id =" + id + ",Firstname= " + Firstname + ", Lastname=" + Lastname + ", email=" + email + "]";
		
	}
}
	