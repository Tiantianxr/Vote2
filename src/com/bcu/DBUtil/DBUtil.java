package com.bcu.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DBUtil {
    public Connection getConnection(){
    	try {
			DriverManager.registerDriver(new Driver());
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bcu?characterEncoding=UTF-8", "root", "123456");
			return conn;
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
    	
    }
}
