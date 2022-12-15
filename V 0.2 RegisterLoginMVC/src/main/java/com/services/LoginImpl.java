package com.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.dataSource.MyConnection;
import com.model.Login;
import com.model.Register;

public class LoginImpl implements LoginServices{

	@Override
	public boolean validateLogin(List<Login> lst) {

			Login log = lst.get(0);
			lst = null;
			MyConnection mycon = new MyConnection();
			Connection con = mycon.getConnection();
			System.out.println("con : "+con);
			
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

	@Override
	public List<Register> getCurrentUser(List<Login> lst) {
		
		
		Login log = lst.get(0);
		lst = null;
		MyConnection mycon = new MyConnection();
		Connection con = mycon.getConnection();
		System.out.println("loginimpl.get current user con : "+con);
		List<Register> lstreg = new ArrayList();
		
		boolean logStatus = false;
		try {
			PreparedStatement pstate = con.prepareStatement("select * from Register where username=? and password=?");
			pstate.setString(1, log.getUname());
			pstate.setString(2, log.getPassword());
			ResultSet result = pstate.executeQuery();
			if(result.next()) {
					
				Register reg = new Register(result.getString(1), result.getString(2), result.getString(3), result.getString(4));
				
				lstreg.add(reg);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		return lstreg;
	}
	
	
	
}
