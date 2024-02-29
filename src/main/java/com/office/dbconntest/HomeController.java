package com.office.dbconntest;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
public class HomeController {

	@GetMapping({"", "/"})
	public String home() {
		log.info("home()");
		
		String nextPage = "home";
		
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://14.42.124.94:3306/DB_KIOSK?serverTimezone=Asia/Seoul", 
					"root", 
					"1234");
			
			log.info("conn: " + conn);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}		

//		try {
//			
//			Class.forName("oracle.jdbc.OracleDriver");
//			Connection conn = DriverManager.getConnection(
//					"jdbc:oracle:thin:@14.42.124.122:1521:XE", 
//					"system", 
//					"1234");
//			
//			log.info("conn: " + conn);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			
//		}
		
		
		return nextPage;
	}
	
}