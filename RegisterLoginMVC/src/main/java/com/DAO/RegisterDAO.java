package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.model.Login;
import com.model.Register;

public class RegisterDAO {

	static Connection con = null;
	static {
		MyConnection db = new MyConnection();
		con = db.getConnection();
	}
	
	public int createAccount(Register reg) {
		Scanner sc = new Scanner(System.in); 
		//MyConnection mycon = new MyConnection();
		//Connection con = mycon.getConnection();
		System.out.println("con : "+con);
		PreparedStatement pstate;
		
		int i = 0;
		try {
			
			pstate = con.prepareStatement("insert into Register values(?, ?, ?, ?)");
			pstate.setString(1, reg.getName());
			pstate.setString(2, reg.getEmail());
			pstate.setString(3, reg.getPassword());
			pstate.setString(4, reg.getUname());
			i = pstate.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return i;
	}
	
	public boolean validateAccount(Login log) {
	
		boolean logStatus = false;
		try {
			PreparedStatement pstate = con.prepareStatement("select * from Register where username=?");
			pstate.setString(1, log.getUname());
			ResultSet result = pstate.executeQuery();
			if(result.next()) {
				String password = result.getString(3);
				if(password.equals(log.getPassword()))
					logStatus = true;
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return logStatus;	
	}

}
/*
create table Register
(
	name varchar2(20),
	email varchar2(20),
	password varchar2(10)
);
 o
*/
