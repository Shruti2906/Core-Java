<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.product.admin.model.*"%>
     <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hello</h1>
	<%!List<Product> lst = null;
			
	%>
	
	<%
		if(!session.isNew()){
			lst = (List<Product>)session.getAttribute("prodlst");
			if(lst != null){
				
		%>
				<table border="3px" background="gray">
				<% for(Product prod:lst){	%>
					<tr>
						<td><%=prod.getProductId() %></td>
						<td><%=prod.getProductName() %></td>
						<td><%=prod.getProductPrice() %></td>
						<td><%=prod.getProductQty() %></td>
					</tr>
				<% } %>
				</table>
		<%	}
			else{
		%>
				<h2 style="color:red">No Record Found.!</h2>
		<%		
			}
		session.invalidate();
		}
		%>
	

</body>
</html>