package com.mbcrud.mbcruddemo.services;

import java.sql.Date;
import java.util.List;
//class
import com.mbcrud.mbcruddemo.model.Customer;

public interface CustomerServices {

	List<Customer> getAllCustomers();

	void addCustomer(Customer customer);

	void deleteCustomerByID(Long id);

	void updateCustomers(
			String firstName,
			String lastName,
			int age,
			Date dob,
			String gender,
			String address1,
			String address2
			);

}
