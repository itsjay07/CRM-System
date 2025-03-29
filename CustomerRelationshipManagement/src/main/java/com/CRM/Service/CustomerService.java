package com.CRM.Service;



import java.util.List;

import com.CRM.Entity.Customer;


public interface CustomerService 
{
	public String insertCustomer (Customer customer);
	
	public List<Customer>getCustomersList();
	
	public Customer getCustomerById(int id);
	
	public String customerUpdate(Customer customer);
	
	public String customerDeleteById(int id);
	
	public String insertMultipleCustomer(List<Customer> customers);
	
	public List<Customer> getCustomerByFirstName(String firstName);
	
	public List<Customer>getCustomersByLessThanAge(int age);
	
	public List<Customer>getCustomerByGreaterThanAge(int age);
	
	public List<Customer> getCustomersByAge(int age);
	
	public List<Customer> getCustomerByLastName(String LastName);
	
	public List<Customer> getCustomerByEmail(String email);
	
	public List<Customer> getCustomerByMobileNum(String MobileNumber);
	
	public String updateFirstName(int id,String firstName);
	
	public String updateLastName(int id, String LastName);
	
	public String updateEmailId(int id, String email);
	
	public String updateMobileNumber(int id, String moblileNumber);
	
	public String updateAge(int id, int age);
	
	public List<String> getCustomersFirstName();
	
	public List<String> getCustomersLasstName();
	
	public List<String>getCustomersMobileNumbers();
	
	public List<Integer>getCustomersAge();
	
	public List<String>getCustomersEmails();

}
