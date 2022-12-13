package com.DAO;



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;
	/*
	 Steps to create jdbc app:
	 
	 step1 : Load Driver
	  Class.forName("oracle.jdbc.OracleDriver");
	  where,
	  jdbc - protocol
	  oracle - sub-protocol
	  thin - driver
	  @localhost - IP address of machine where Database is installed.
	  1521 - port number
	  path: C:\oraclexe\app\oracle\product\10.2.0\server\NETWORK\ADMIN\tnsnames.ora file contains info about port and service name(XE)
	 
	 step2 :
	  connect to database using connection Interface.
	  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1612");
	 
	 
	  add jar files : C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib
	 
	 
	 
	 */
	
public class MainDemo {
	static Connection con = null;
		static {
			MyConnection db = new MyConnection();
			 con = db.getConnection();
		}
		
		public int save() {

	Scanner sc = new Scanner(System.in);

	
	System.out.println("Thank You! got con : "+con);
	return 0;
	}

	}




