package com.ibm.Services;

import java.sql.SQLException;

import com.allen.DOAS.LoginDAO;

public class LoginService {

	public static boolean checkuser(String username, String password) throws ClassNotFoundException, SQLException {	
	
	
		if(username == null && password == null) {
				return false;
		}
		 if(LoginDAO.dbcheck(username, password) == true) {
			 return true;
		 }
		 	return false;
		
		
		
	}
		
}
	
 
