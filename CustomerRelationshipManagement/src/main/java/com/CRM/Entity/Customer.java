package com.CRM.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customers")
public class Customer 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String LastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="Mobile_Number")
    private String MobileNumber;
    
	@Column(name="Age")
	private int age;
	
	
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String firstName, String lastName, String email, String mobileNumber, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.LastName = lastName;
		this.email = email;
		this.MobileNumber = mobileNumber;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.MobileNumber = mobileNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	
	



	
	
}
