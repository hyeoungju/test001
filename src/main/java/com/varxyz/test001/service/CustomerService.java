package com.varxyz.test001.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.varxyz.test001.domain.Customer;

public interface CustomerService {
	Customer getCustomerByUserId(String userId);
	boolean isUser(String userId, String passwd);
}
