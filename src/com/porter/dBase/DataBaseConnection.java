package com.porter.dBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {
	private String protocol = "jdbc:derby:";
	private String EmbedDriver = "org.apache.derby.jdbc.EmbeddedDriver";
	String dbName = "MyDB";
	Connection conn;
	 Statement stmt = null;
	public void OpenDB(String dbName) {
		
			try {
				Class.forName(EmbedDriver);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		try {
			conn = DriverManager.getConnection(protocol + dbName + ";create=true");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void AddTable(String TableName)
	{
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "CREATE TABLE "+TableName+"(ID INT)";
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.print("Table already added");
			//e.printStackTrace();
		}
	}
	
	public void AddColumn(String tableName, String ColName, String ColType)
	{
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sql = "ALTER TABLE " + tableName + " ADD " + ColName + " " + ColType;
		
		
			try {
				stmt.execute(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
	
	

