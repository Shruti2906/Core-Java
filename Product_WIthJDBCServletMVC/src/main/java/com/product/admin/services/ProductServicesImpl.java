package com.product.admin.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.product.admin.db.DataSource;
import com.product.admin.model.Product;

public class ProductServicesImpl implements ProductServices{

	@Override
	public String create(List<Product> lst) {
		
		String str=null;
		Product prod = lst.get(0);
		DataSource dbconnection = new DataSource();
		Connection con = dbconnection.getConnection();
		try {
			PreparedStatement pstate = con.prepareStatement("insert into Product values(?,?,?,?)");
			pstate.setInt(1, prod.getProductId());
			pstate.setString(2, prod.getProductName());
			pstate.setDouble(3, prod.getProductPrice());
			pstate.setInt(4, prod.getProductQty());
			int i = pstate.executeUpdate();
			if(i>0) {
				str = "valid";
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			str = e.getMessage();
		}
		
		return str;
	}

}
/*
 create table product
 (
 	productId number(20),
 	productName varchar2(30),
 	productPrice float,
 	ProductQty number(20)	
 );
  
  
  
 */
