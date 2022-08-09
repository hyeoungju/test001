package com.varxyz.test001.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.varxyz.test001.dao.CustomerDao;
import com.varxyz.test001.domain.Customer;

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDao customerDao;

	public boolean isUser(String userId, String passwd) {
		return customerDao.isUser(userId, passwd);
	}
	
	public Customer getCustomerByUserId(String userId) {
		return customerDao.getCustomerByUserId(userId);
	}
	
	
}
