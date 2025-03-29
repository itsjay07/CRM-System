package com.CRM.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CRM.Entity.Customer;
@Repository
public class CustomerDao 
{

	//Business Logic
	
	@Autowired
	SessionFactory sf;
	
//1
	public String insertCustomer(Customer customer)
	{
		Session session =sf.openSession();
		Transaction tr=session.beginTransaction(); //inser ,update, delete -> need to use Transaction
		session.save(customer);
		tr.commit(); 
		session.close();
		
		return "Customer inserted Successfully";	
	}
	
	//------------------------------------------------------------------------------------------------------
//2	
	public List<Customer> getCustomersList()
	{
		Session session=sf.openSession();
		return session.createQuery("from Customer").list();
	}
	
	//------------------------------------------------------------------------------------------------------
//3
	public Customer getcustomerById(int id)
	{
		Session session = sf.openSession();
		Customer customer = session.get(Customer.class, id);
		//get  ->  it will return if object not found in database;
		//load ->  it will return objectNotFoundException in database;
		return customer;
		
	}
	
	//------------------------------------------------------------------------------------------------------
//4
	public String updateCustomer(Customer customer)
	{
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(customer);
		tr.commit();
		session.close();
		return "Customer Updated Successfully :)";
	}
	
	//------------------------------------------------------------------------------------------------------
//5
	public String deleteCustomerById(int id)
	{
		Session session = sf.openSession();
		Transaction tr= session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		session.delete(customer);
		tr.commit();
		session.close();
		
		return "Customer Deleted Successfully";
	}
	
	//------------------------------------------------------------------------------------------------------
//6
	public String insertMultipleCustomers(List<Customer> customers)
	{
		Session session=sf.openSession();
		Transaction tr = session.beginTransaction();
		
		for(Customer customer:customers)
		{
			session.save(customer);
		}
		tr.commit();
		session.close();
		
		return "Customers are inserted Successfully";
	}
	
	//------------------------------------------------------------------------------------------------------
//7
	public List<Customer> getCustomersByFirstName(String firstName)
	{
		Session session = sf.openSession();
		
		Query <Customer> customer = session.createQuery("from Customer c where c.firstName=:firstName",Customer.class);
		customer.setParameter("firstName", firstName);
		List<Customer> list = customer.list();
		
		return list;
	}
	
	//------------------------------------------------------------------------------------------------------
//8
	public List<Customer>getCustomersByLessThanAge(int age)
	{
		Session session = sf.openSession();
		
		Query<Customer> customers = session.createQuery("from Customer c where age<:age",Customer.class);
		customers.setParameter("age", age);
		List<Customer> list= customers.list();
		
		return list;
	}
	
	//------------------------------------------------------------------------------------------------------
//9
	public List<Customer>getCustomerByGreaterThanAge(int age)
	{
		String hql = "from Customer c where age>:age";
		Session session = sf.openSession();
		
		Query<Customer> customer = session.createQuery(hql,Customer.class);
		customer.setParameter("age", age);
		List<Customer> list = customer.list();
		
		return list;
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
//10
	public List<Customer> getCustomersByAge(int age)
	{
		String hql="from Customer c where c.age =: age";
		Session session = sf.openSession();
		
		Query<Customer> customers = session.createQuery(hql,Customer.class);
		customers.setParameter("age", age);//tables column name & variable
		List<Customer> list = customers.list();
		
		return list; 	
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
//11
	public List<Customer> getCustomerByLastName(String LastName)
	{
		String hql="from Customer c where c.LastName =: LastName";
		Session session = sf.openSession();
		
		  Query<Customer> customer = session.createQuery(hql,Customer.class);
		  customer.setParameter("LastName", LastName);
		  List<Customer> list = customer.list();
		  
		  return list;
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
//12
	public List<Customer> getCustomerByEmail(String email)
	{
		String hql="from Customer c where c.email =: email";
		Session session = sf.openSession();
		
		  Query<Customer> customer = session.createQuery(hql,Customer.class);
		  customer.setParameter("email", email);
		  List<Customer> list = customer.list();
		  
		  return list;
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
//13
	public List<Customer> getCustomerByMobileNum(String MobileNumber)
	{
		String hql="from Customer c where c.MobileNumber =: MobileNumber";
		Session session = sf.openSession();
		
		  Query<Customer> customer = session.createQuery(hql,Customer.class);
		  customer.setParameter("MobileNumber", MobileNumber);
		  List<Customer> list = customer.list();
		  
		  return list;	  
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
//14
	public String updateFirstName(int id,String firstName)
	{
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Customer customer = session.get(Customer.class,id );
		System.out.println("Before update: " + customer.getFirstName());
		customer.setFirstName(firstName);
		System.out.println("After update: " + customer.getFirstName());
		session.update(customer);
		tr.commit();
		session.close();
		
		return "Updated First Name Successfully";
	}
	
    //-------------------------------------------------------------------------------------------------------------------------------------------
//15
	public String updateLastName(int id, String LastName)
	{
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Customer customer = session.get(Customer.class, id);
		customer.setLastName(LastName);
		
		tr.commit();
		session.close();
		
		return "Updated Last Name Successfully";
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
//16
	public String updateEmailId(int id, String email)
	{
		Session session = sf.openSession();
		Transaction tr=session.beginTransaction();
		
		Customer customer= session.get(Customer.class, id);
		System.out.println("Before update: " + customer.getEmail());

		customer.setEmail(email);
		session.update(customer); 
		tr.commit();

        System.out.println("After update: " + customer.getEmail());
		session.close();
		
		return "Email has been updated";
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
//17
	public String updateMobileNumber(int id, String moblileNumber)
	{
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		
		customer.setMobileNumber(moblileNumber);
		tr.commit();
		session.close();
		
		return "Mobile Number has been updated";
					
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
//18
	public String updateAge(int id, int age)
	{
		Session session = sf.openSession();
		Transaction tr=session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		
		customer.setAge(age);
		tr.commit();
		session.close();
		
		return "Age has been updated";
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
//19
	public List<String> getCustomersFirstName()
	{
		Session session = sf.openSession();
		return session.createQuery("select c.firstName from Customer c").list();
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
//20
	public List<String>getCustomersLastName()
	{
		Session session = sf.openSession();
		return session.createQuery("select c.LastName from Customer c").list();		
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
//21
	public List<String>getCustomersMobileNumbers()
	{
		Session session = sf.openSession();
		return session.createQuery("select c.MobileNumber from Customer c").list();
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
//22
	public List<Integer>getCustomersAge()
	{
		Session session = sf.openSession();
		return session.createQuery("select c.age from Customer c").list();
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
//23
	public List<String>getCustomersEmails()
	{
		Session session = sf.openSession();
		return session.createQuery("select c.email from Customer c").list();
	}
	
}
