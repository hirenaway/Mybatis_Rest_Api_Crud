package com.mbcrud.mbcruddemo.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {

	private Long id;
	private String firstName;
	private String lastName;
	private int age;
	private Date dob;
	private String gender;
	private String email;
	private String mobile;
	private String address1;
	private String address2;

}