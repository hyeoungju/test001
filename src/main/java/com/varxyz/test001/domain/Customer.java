package com.varxyz.test001.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Customer {
	private long cId;
	private String userId;
	private String passwd;
	private String name;
	
	public Customer() {
		
	}
	
	public Customer(long cId) {
		this.cId = cId;
	}
}
