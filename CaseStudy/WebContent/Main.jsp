<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%
    	if(session.getAttribute("username")==null)
    	{
    		response.sendRedirect("login.jsp");
    	}
    	
    %>
    
    <form action="logout">
    	<input type="submit" value="logout">
    </form>
    
    <center>
    	<%-- <%LoginBean currentuser = (LoginBean(session.getAttribute("username"))); %> --%>
    
   			 Welcome <%-- <% currentuser.getUsername();%> --%>
    </center>
    
      <form  action="EmployeeServlet" method="get">
		  First name:
		  <input type="text" name="firstname">
          <br>
          <br>
		  Last name:
		  <input type="text" name="lastname">
          <br>
          <br>
          Name of Resource :
          <input type="text" name="nof">
          <br>
          <br>
          Serial Number :
          <input type="text" name="sn">
          <br>
          <br>
          JRSS :
          <input type="text" name="jrss">
		  <br>
		  <br>
		  Band :
		  <input type="text" name="band">
		  <br>
		  <br>
		  Account (Proposed) :
		  <input type="text" name="acc">
		  <br>
		  <br>
		  PMP Seat :
		  <input type="text" name="pmp">
		  <br>
		  <br>
		  Seat JRSS :
		  <input type="text" name="sj">
		  <br>
		  <br>
		  Open Seat Description
		  <input type="text" name="osd">
		  <br>
		  <br>
		  Required Skills :
		  <input type="text" name="skills">
		  <br>
		  <br>
		  Requested Band low/high :
		  <input type="text" name="reqband">
		  <br>
		  <br>
		  Date of Rejection :
		  <input type="date" name="daterej">
		  <br>
		  <br>
		  Reason for rejection:
		  <textarea rows="4" cols="50" name="rfr" form="usrform">
		  </textarea>
		  <br>
		  <br>
		  Detailed action plan:
		   <textarea rows="4" cols="50" name="dap" form="usrform">
		  </textarea>
		  <br>
		  <br>
		  Target Date of completion
		  <input type="date" name="tdoc">
		  <br>
		  <br>
		  Status (Ongoing,Closed)
		  <select>
			  <option value="ongoing">Ongoing</option>
			  <option value="closed">Closed</option>
		  </select>
          <br>
          <br>    
          
         <input type="submit" value="Submit">     
  		  
	</form>
</body>
</html>