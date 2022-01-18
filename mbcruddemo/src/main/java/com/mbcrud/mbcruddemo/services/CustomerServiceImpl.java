package com.mbcrud.mbcruddemo.services;


import java.sql.Date;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
//class & interface
import com.mbcrud.mbcruddemo.mapper.CustomerMapper;
import com.mbcrud.mbcruddemo.model.Customer;
import com.mbcrud.mbcruddemo.util.DbSession;
@Service
public class CustomerServiceImpl implements CustomerServices {

	@Override
	public List<Customer> getAllCustomers() {
		SqlSession sqlSession = DbSession.getSqlSessionFactory().openSession();
		try{
			CustomerMapper Mapper = sqlSession.getMapper(CustomerMapper.class);
			return Mapper.getAll();
		}finally{
			sqlSession.close();
		}
	}

	@Override
	public void addCustomer(Customer customer) {
		SqlSession sqlSession = DbSession.getSqlSessionFactory().openSession();
		try{
			CustomerMapper Mapper = sqlSession.getMapper(CustomerMapper.class);
			Mapper.saveCustomer(customer);
			sqlSession.commit();
		}finally{
			sqlSession.close();
		}
	}

	@Override
	public void updateCustomers(
			String firstName, 
			String lastName, 
			int age, 
			Date dob, 
			String gender,  
			String address1, 
			String address2) {
		SqlSession sqlSession = DbSession.getSqlSessionFactory().openSession();
		try{
			CustomerMapper Mapper = sqlSession.getMapper(CustomerMapper.class);
			Mapper.updateCustomer(firstName, lastName, age, dob, gender, address1, address2);
			sqlSession.commit();
		}finally{
			sqlSession.close();
		}
	}

	@Override
	public void deleteCustomerByID(Long id) {
		SqlSession sqlSession = DbSession.getSqlSessionFactory().openSession();
		try{
			CustomerMapper Mapper = sqlSession.getMapper(CustomerMapper.class);
			Mapper.deleteCustomerById(id);
			sqlSession.commit();
		}finally{
			sqlSession.close();
		}
	}

}