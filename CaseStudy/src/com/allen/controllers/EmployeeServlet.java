package com.allen.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.allen.entities.EmployeeBean;
import com.ibm.Services.EmployeeService;


public class EmployeeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeBean empbean = new EmployeeBean();
		
		empbean.setFirstName(request.getParameter("firstname"));
		empbean.setLastName(request.getParameter("lastname"));
		empbean.setNameofResource(request.getParameter("nof"));
		empbean.setSerialNumber(request.getParameter("sn"));
		empbean.setJRSS(request.getParameter("jrss"));
		empbean.setBand(request.getParameter("band"));
		empbean.setAccount(request.getParameter("acc"));
		empbean.setPmpSeat(request.getParameter("pmp"));
		empbean.setSeatJRSS(request.getParameter("sj"));
		empbean.setOpenseatDes(request.getParameter("osd"));
		empbean.setReqSkills(request.getParameter("skills"));
		empbean.setReqLowBand(request.getParameter("reqband"));
		empbean.setDateofRej(request.getParameter("daterej"));
		empbean.setReasonofRej(request.getParameter("rfr"));
		empbean.setDetailedAction(request.getParameter("dap"));
		empbean.setDateofCompletion(request.getParameter("tdoc"));
		empbean.setStatus(request.getParameter("status"));		
		
		 if(EmployeeService.checkemployee(empbean.getFirstName(), empbean.getLastName(), empbean.getNameofResource(),
				empbean.getSerialNumber(),empbean.getJRSS(), empbean.getBand(), empbean.getAccount(),
				empbean.getPmpSeat(), empbean.getSeatJRSS(), empbean.getOpenseatDes(), empbean.getReqSkills(),
				empbean.getReqLowBand(), empbean.getDateofRej(), empbean.getReasonofRej(), empbean.getDetailedAction(),
				empbean.getDateofCompletion(), empbean.getStatus()) == false) {
			 
			 	RequestDispatcher dispatcher = request.getRequestDispatcher("Main.jsp");
				dispatcher.forward(request, response);
		 }
		 
		 		System.out.println("Insert Successfull");
		
	
		
		
		
		
		
	}

	


}
