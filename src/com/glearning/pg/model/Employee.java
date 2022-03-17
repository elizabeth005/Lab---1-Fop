package com.glearning.pg.model;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String emailadress;
	
	
	
	private String password;
	private String dept;
	

	public Employee (String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
			
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmailadress() {
		return emailadress;
	}


	public void setEmailadress(String emailadress) {
		this.emailadress = emailadress;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}
	
		
		
	}



	


