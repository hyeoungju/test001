package com.varxyz.test001.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.varxyz.test001.domain.Customer;


public class CustomerDao {
	private JdbcTemplate jdbcTemplate;
	
	public CustomerDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public Customer getCustomerByUserId(String userId){
		String sql = "SELECT * FROM Customer WHERE userId=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer customer = new Customer(rs.getLong("cId"),
						rs.getString("userId"), rs.getString("name"),
						rs.getString("passwd"));
				return customer;
			}
			
		}, userId);
	}
	
	public boolean isUser(String userId, String passwd) {
		String sql = "SELECT count(*) FROM Customer WHERE userId=? AND passwd=?";
		boolean result = true;
		int ishere = jdbcTemplate.queryForObject(sql, Integer.class, userId, passwd);
		if(ishere == 0 ) {
			result = false; 
		}
		return result;
		
	}
	
}

