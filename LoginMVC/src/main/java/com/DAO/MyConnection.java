package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	public Connection getConnection() {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String UserName = "system";
		String pass = "1612";
		String str;

		Connection con=null;
		try {
		Class.forName(driver);
		con = DriverManager.getConnection(url,UserName,pass);
		System.out.println("connection to system done!"+con);

			} catch (ClassNotFoundException | SQLException e) {

		e.printStackTrace();
		}
		return con;
		
	}
}
