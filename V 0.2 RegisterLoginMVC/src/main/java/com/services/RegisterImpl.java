package com.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dataSource.MyConnection;
import com.model.Register;

public class RegisterImpl implements RegisterServices{
	
	public int create(List<Register> lst) {
		Scanner sc = new Scanner(System.in);
		
		Register reg = lst.get(0);
		lst = null;
		
		MyConnection mycon = new MyConnection();
		Connection con = mycon.getConnection();
		System.out.println("con : "+con);
		PreparedStatement pstate;
		
		int i = 0;
		try {
			
			pstate = con.prepareStatement("insert into Register values(?, ?, ?, ?)");
			pstate.setString(1, reg.getName());
			pstate.setString(2, reg.getEmail());
			pstate.setString(3, reg.getUname());
			pstate.setString(4, reg.getPassword());
			
			i = pstate.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return i;
		
	}

}
