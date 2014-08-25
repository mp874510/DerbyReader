package com.porter.dBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
	private String protocol = "jdbc:derby:";
	private String EmbedDriver = "org.apache.derby.jdbc.EmbeddedDriver";
	String dbName = "MyDB";
	Connection conn;
	public void OpenDB() throws ClassNotFoundException
	{
		
			Class.forName(EmbedDriver);
		
		
		try {
			conn = DriverManager.getConnection(protocol + dbName + ";create=true");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
