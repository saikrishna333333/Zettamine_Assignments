package com.zettamine.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {
	
public static Connection  con=null;
	
	public static Connection getConection() throws ClassNotFoundException, SQLException {
		
		if(con == null) {
			ResourceBundle bundle = ResourceBundle.getBundle("dbConfig");
			
			String dc = bundle.getString("jdbc.driverclass");
			String url = bundle.getString("jdbc.url");
			String uname = bundle.getString("jdbc.username");
			String pass  = bundle.getString("jdbc.password");
			
			Class.forName(dc);
			con = DriverManager.getConnection(url,uname,pass);
		}
		return con;
	}

}
