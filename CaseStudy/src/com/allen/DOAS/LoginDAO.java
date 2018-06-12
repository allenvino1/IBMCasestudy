package com.allen.DOAS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoginDAO {	
	
	public static boolean dbcheck(String username, String password) throws ClassNotFoundException, SQLException {
				
		Connection conn = null;
		
		String Driver ="com.mysql.jdbc.Driver";	
		
	    Class.forName(Driver);		    
		
	    conn = DriverManager.getConnection("jdbc:mysql://localhost/casestudy","root","root"); 		
			
		String query = "select * from Users where username=? and password=?";
		java.sql.PreparedStatement viewsql = conn.prepareStatement(query);				
		
		
		viewsql.setString(1, username);
		viewsql.setString(2, password);
		
		
	    ResultSet viewprocess = viewsql.executeQuery();
	    boolean st = true;
	    
		st=viewprocess.next();
		
		return st;
		
		
	}

}
