<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ page import="com.user.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>confirm</title>
</head>
<body>


	<%!List<Product> lst = null; %>
	
	<%lst=(List<Product>)session.getAttribute("prodlst"); 
		for(Product p:lst){
			%>
			
			<table>
				<tr>
					<td><%=p.getProdId() %></td>
					<td><%=p.getProdName() %></td>
					<td><%=p.getProdPrice() %>
					<td><%=p.getProdQty() %></td>
				</tr>
			
			</table>
			<%
		}
		out.println("do you want to add more products?");
	%>
	<div>
		<a href="Product.jsp">Yes</a>
		<a href="BillServlet">No</a>
	</div>
	

</body>
</html>