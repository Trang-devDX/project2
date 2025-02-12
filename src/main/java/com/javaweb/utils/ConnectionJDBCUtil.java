package com.javaweb.utils;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import com.mysql.cj.jdbc.Driver;

@PropertySource("classpath:application.properties")

public class ConnectionJDBCUtil {
	@Value("${spring.datasource.url}")
	static String DB_URL;
	
	@Value("${spring.datasource.username}")
	static String USER;
	
	@Value("${spring.datasource.password}")
	static String PASSWORD;
	
//	private static final String DB_URL = "jdbc:mysql://localhost:3306/estateadvance"; 
//    private static final String USER = "root"; 
//    private static final String PASSWORD = "27032003";
    
    public static Connection getConnection() {
    	Connection conn = null;
    	try {
    		conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
    		return conn;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	return conn;
    }
}
