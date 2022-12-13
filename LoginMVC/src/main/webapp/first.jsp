<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.IssuerSerialNumRequest"%>
<%@page import="linkcode.grp1.model.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="SearchServlet" method="post">
<table border="2" align="center" bgcolor="gray">

<h2>Search record page</h2>

  <tr>
     <td>RegNo</td>
     <td><input type="text" name="rno"></td>
  </tr>
 
  <tr>
     <td><input type="submit" value="search"></td>
  </tr>
 
  </table>
 
</form>

<%! Register r=null; %>
<%
if(!session.isNew())
{

   r=(Register)session.getAttribute("sdata");  
   session.invalidate();
%>

<table border="2px">
<tr><th>REGNO</th><th>FNAME</th><th>BAL</th></tr>
<tr><td><%= r.getRno() %></td><td><%= r.getFname() %></td><td><%= r.getBal() %></td></tr>

</table>
<%
}

%>
</body>
</html>