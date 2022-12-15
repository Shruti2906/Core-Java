package com.services;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.model.Login;
import com.model.Register;

public interface LoginServices {

	public boolean validateLogin(List<Login> lst);
	public List<Register> getCurrentUser(List<Login> lst);
	//view user data
	//update user data
}
