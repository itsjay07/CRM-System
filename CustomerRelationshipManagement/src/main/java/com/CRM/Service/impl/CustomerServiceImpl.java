package com.CRM.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRM.Dao.CustomerDao;
import com.CRM.Entity.Customer;
import com.CRM.Service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	
	@Override
	public String insertCustomer(Customer customer) 
	{
		
		String msg = customerDao.insertCustomer(customer);
		
		return msg;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public List<Customer> getCustomersList() 
	{
		
	  List<Customer>list=customerDao.getCustomersList();
	  
	  return list;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------------
	
	@Override
	public Customer getCustomerById(int id) 
	{
		Customer customer = customerDao.getcustomerById(id);
		
		return customer;		
	}

	//-------------------------------------------------------------------------------------------------------------------------------------------
	
	@Override
	public String customerUpdate(Customer customer) 
	{	
		return customerDao.updateCustomer(customer);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public String customerDeleteById(int id) 
	{
		
		return customerDao.deleteCustomerById(id);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public String insertMultipleCustomer(List<Customer> customers) 
	{
		
		return customerDao.insertMultipleCustomers(customers);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public List<Customer> getCustomerByFirstName(String firstName) 
	{
		
		return customerDao.getCustomersByFirstName(firstName);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public List<Customer> getCustomersByLessThanAge(int age) 
	{
		
		return customerDao.getCustomersByLessThanAge(age);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public List<Customer> getCustomerByGreaterThanAge(int age) 
	{
		
		return customerDao.getCustomerByGreaterThanAge(age);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public List<Customer> getCustomersByAge(int age) 
	{
		
		return customerDao.getCustomersByAge(age);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public List<Customer> getCustomerByLastName(String LastName) 
	{
		
		return customerDao.getCustomerByLastName(LastName);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public List<Customer> getCustomerByEmail(String email) 
	{
	
		return customerDao.getCustomerByEmail(email);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public List<Customer> getCustomerByMobileNum(String MobileNumber) 
	{
		
		return customerDao.getCustomerByMobileNum(MobileNumber);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public String updateFirstName(int id, String firstName) 
	{
		
		return customerDao.updateFirstName(id, firstName);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public String updateLastName(int id, String LastName) 
	{
		
		return customerDao.updateLastName(id, LastName);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public String updateEmailId(int id, String email) 
	{
		
		return customerDao.updateEmailId(id, email);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public String updateMobileNumber(int id, String moblileNumber) 
	{
		
		return customerDao.updateMobileNumber(id, moblileNumber);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public String updateAge(int id, int age) 
	{
		
		return customerDao.updateAge(id, age);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public List<String> getCustomersFirstName() 
	{
		
		return customerDao.getCustomersFirstName();
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public List<String> getCustomersLasstName() 
	{
		
		return customerDao.getCustomersLastName();
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

    @Override
	public List<String> getCustomersMobileNumbers() 
    {
		
		return customerDao.getCustomersMobileNumbers();
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public List<Integer> getCustomersAge() 
    {
    	
    	return customerDao.getCustomersAge();
    }
    
	//-------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public List<String> getCustomersEmails() 
    {
    	
    	return customerDao.getCustomersEmails();
    }
}
