package com.allen.controllers;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.allen.entities.LoginBean;
import com.ibm.Services.LoginService;




@WebServlet(name="LoginServlet", urlPatterns={"/LoginServlet"})
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	try {			
			
			LoginBean loginbean = new LoginBean();
			
			loginbean.setUsername(request.getParameter("username"));
			loginbean.setPassword(request.getParameter("password"));				
			
			
			
			System.out.println(loginbean.getUsername());
			System.out.println(loginbean.getPassword());					
			
			if(LoginService.checkuser(loginbean.getUsername(), loginbean.getPassword()) == true) {	
				
				HttpSession session = request.getSession();
				
				session.setAttribute("username", loginbean.getUsername());
	
				RequestDispatcher dispatcher = request.getRequestDispatcher("Main.jsp");
				dispatcher.forward(request, response);									
													
			}else {
			
				RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
				dispatcher.forward(request, response);	
		}	
			System.out.println(LoginService.checkuser(loginbean.getUsername(), loginbean.getPassword()));
	}
			
		catch (Throwable theException)
		{
		 System.out.println(theException); 
		}		
		
	}

		
}
