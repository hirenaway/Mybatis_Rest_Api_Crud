package com.mbcrud.mbcruddemo.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbcrud.mbcruddemo.model.Customer;
import com.mbcrud.mbcruddemo.services.CustomerServices;

@RestController
@RequestMapping("/data")
public class CustomerController {

	@Autowired
	private CustomerServices services;

	@GetMapping("/list")
	public List<Customer> getAllCustomers(){
		return services.getAllCustomers();
	}

	@PostMapping("/saveCustomer")
	public void saveCustomer(@RequestBody Customer customer) {
		services.addCustomer(customer);
	}

	@GetMapping("/deleteCustomer")
	public void deleteCustomerById(Long id) {
		services.deleteCustomerByID(id);
	}

	@GetMapping("/updateCustomer")
	public void updateCustomer(
			String firstName,
			String lastName,
			int age,
			Date dob,
			String gender,
			String address1,
			String address2
			) {
		services.updateCustomers(firstName, lastName, age, dob, gender, address1, address2);
	}

}