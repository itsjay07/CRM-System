package com.CRM.Controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRM.Entity.Customer;
import com.CRM.Service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController 
{
	
	@Autowired
	CustomerService customerService;
	
	//1
	@PostMapping("/insert")//insert only one customer at a time
	public String insertCustomer(@RequestBody Customer customer)
	{
		String msg =customerService.insertCustomer(customer);
		
		return msg;
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	
	//2
	@GetMapping
	public List<Customer>getCustomersList() //get all customers list
	{
		List<Customer>list=customerService.getCustomersList();
		
		return list; 
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	
	//3
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable int id)
	{
		return customerService.getCustomerById(id);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//4
	@PutMapping 
	public String customerUpdate(@RequestBody Customer customer)
	{
		return customerService.customerUpdate(customer);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------------

	//5
	@DeleteMapping("/{id}")
	public String customerDeleteById(@PathVariable int id)
	{
		return customerService.customerDeleteById(id);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//6
	@PostMapping
	public String insertMultipleCustomer(@RequestBody List<Customer> customers)//normal object is not capable to insert multiple customer so we need @Requestbody
	{
		return customerService.insertMultipleCustomer(customers);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//7
	@GetMapping("/byname/{firstName}")
	public List<Customer> getCustomerByFirstName(@PathVariable String firstName)//normal variable not able to get data from URL so we need @Pathvariable
	{
		return customerService.getCustomerByFirstName(firstName);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//8
	@GetMapping("/bylessthanage/{age}") //for less age
	public List<Customer> getCustomersByLessThanAge(@PathVariable int age)
	{
		return customerService.getCustomersByLessThanAge(age);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
	
	//9
	@GetMapping("/bygreaterthanage/{age}") //for greater age
	public List<Customer> getCustomerByGreaterThanAge(@PathVariable int age)
	{
		return customerService.getCustomerByGreaterThanAge(age);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	 //10
	@GetMapping("/byage/{age}")
	public List<Customer> getCustomersByAge(@PathVariable int age)//for current age
	{
		return customerService.getCustomersByAge(age);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//11
	@GetMapping("/bylastname/{LastName}")
	public List<Customer> getCustomerByLastName(@PathVariable String LastName)
	
	{
		return customerService.getCustomerByLastName(LastName);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//12
	@GetMapping("/byemail/{email}")
	public List<Customer> getCustomerByEmail(@PathVariable String email)
	{
		return customerService.getCustomerByEmail(email);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//13
	@GetMapping("/bynum/{MobileNumber}")
   public List <Customer>getCustomerByMobileNum(@PathVariable String MobileNumber)
   {
	   return customerService.getCustomerByMobileNum(MobileNumber);
   }
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//14
	@PutMapping("/firstname/{id}")//update by first name
	public String updateFirstName(@PathVariable int id,@RequestBody Map <String, String> request)
	{
		String firstName = request.get("firstName");
		System.out.println("Received firstName: " + firstName);
		return customerService.updateFirstName(id, firstName);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//15
	@PutMapping("/lastname/{id}")
	public String updateLastName(@PathVariable int id, @RequestBody Map<String, String> request)
	
	{
		String LastName = request.get("lastName");
		System.out.println("received LastName :" +LastName);
		return customerService.updateLastName(id, LastName);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//16
	@PutMapping("/email/{id}")
	public String updateEmailId(@PathVariable int id, @RequestBody Map<String , String> request)
	{
		String email = request.get("email");
		
		return customerService.updateEmailId(id, email);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//17
	@PutMapping("/mobile/{id}")
	public String updateMobileNumber(@PathVariable int id,@RequestBody  Map<String, String>request)
	{
		String MobileNumber = request.get("MobileNumber");
		
		return customerService.updateMobileNumber(id, MobileNumber);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//18
	@PutMapping("/age/{id}") 
	public String updateAge(@PathVariable int id,@RequestBody Map<String ,Integer>request )
	{
		int age= request.get("Age");
		
		return customerService.updateAge(id, age);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//19
	@GetMapping("/firstnames")
	public List<String> getCustomersFirstName()
	{
		return customerService.getCustomersFirstName();
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//20
	@GetMapping("/lastnames")
	public List<String> getCustomersLastName()
	{
		return customerService.getCustomersLasstName();
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//21
	@GetMapping("/mobileNumbers")
	public List<String>getCustomersMobileNumbers()
	{
		return customerService.getCustomersMobileNumbers();
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//22
	@GetMapping("/allage")
	public List<Integer>getCustomersAge()
	{
		return customerService.getCustomersAge();
	}

	//-------------------------------------------------------------------------------------------------------------------------------------------

	//23
	@GetMapping("/mails")	
	public List<String>getCustomersEmails()
	{
		return customerService.getCustomersEmails();
	}
	
	
	
	
	
	
}
