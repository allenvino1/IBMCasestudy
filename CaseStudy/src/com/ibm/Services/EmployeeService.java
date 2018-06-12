package com.ibm.Services;

import com.allen.DOAS.EmployeeDAO;

public class EmployeeService {
	
	public static boolean checkemployee(String fname, String lname, String nof, String sn, String jrrs,
			String band, String acc, String pmp, String sd, String osd, String skills, String reqband, 
			String daterj, String rfr, String dap, String tdoc, String status) {
		
		
		 if (fname!=null && lname != null && nof != null && sn != null && jrrs != null &&
				 band != null && acc != null && pmp != null && sd != null && osd != null &&
				 skills != null && reqband != null && daterj != null && rfr != null && dap != null 
				 && tdoc != null  && status != null ) {		
			 
			 return false;
			 
		 }
		 
		 if (EmployeeDAO.insertDB(fname, lname, nof, sn, jrrs, band )==true) {
			 
			 return true;
		 }
		 	return false;
		
			
		
		
	}

}
