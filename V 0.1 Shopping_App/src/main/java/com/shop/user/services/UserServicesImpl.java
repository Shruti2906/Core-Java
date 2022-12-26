package com.shop.user.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.LinkedList;
import java.util.List;

import com.shop.admin.model.Product;
import com.shop.datasource.MyConnection;

public class UserServicesImpl implements UserServices {

	@Override
	public List<Product> displayAll() {
		
		MyConnection mycon = new MyConnection();
		Connection con = mycon.getConnection();
		
		List<Product> lst = new LinkedList<Product>();
		String str = "select * from product";
		Statement state = null;
		try {
			state = con.createStatement();
			ResultSet result = state.executeQuery(str);
			
			while(result.next()){
					Product prod = new Product(result.getInt(1), result.getString(2), result.getDouble(3), result.getInt(4));
					lst.add(prod);
					System.out.println("in loop");
			}
			
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
		return lst;
	}

	@Override
	public List<Product> getProductById(int prodId) {

		List<Product> plst = new LinkedList();
		Product prod = null;
		MyConnection mycon = new MyConnection();
		Connection con = mycon.getConnection();
		try {
			PreparedStatement pstate = con.prepareStatement("select * from product where PRODUCT_ID=?");
			pstate.setInt(1, prodId);
			ResultSet result = pstate.executeQuery();
			if(result.next()) {
				prod = new Product(result.getInt(1), result.getString(2), result.getFloat(3), result.getInt(4));
				plst.add(prod);
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return plst;
	}

}
