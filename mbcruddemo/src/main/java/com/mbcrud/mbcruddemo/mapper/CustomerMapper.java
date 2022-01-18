package com.mbcrud.mbcruddemo.mapper;

import java.sql.Date;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
//class
import com.mbcrud.mbcruddemo.model.Customer;

@Mapper
public interface CustomerMapper {

	public List<Customer> getAll();

	void saveCustomer(Customer customer);

	void deleteCustomerById(Long id);

	public void updateCustomer(
		@Param ("firstName") String firstName, 
		@Param ("lastName") String lastName, 
		@Param ("age") int age, 
		@Param ("dob") Date dob, 
		@Param ("gender") String gender,
		@Param ("address1") String address1,
		@Param ("address2") String address2
		);

}