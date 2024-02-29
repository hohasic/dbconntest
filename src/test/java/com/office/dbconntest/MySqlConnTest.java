package com.office.dbconntest;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MySqlConnTest {

	@Test
	public void connTest() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://14.42.124.97:3306/", 
					"root", 
					"1234");
			
			log.info("conn: " + conn);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
}
