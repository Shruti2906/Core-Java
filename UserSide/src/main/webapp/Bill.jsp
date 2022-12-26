<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import ="java.util.List" %>
   <%@ page import ="com.user.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!List<Product> lst = null;
		Bill bobj = null;
	%>
	
	<%List<Product> lst = (List<Product>) session.getAttribute("prodlst"); 
		for(Product p:lst){
			
		%>
			<table>
				<tr>
					<td><%=p.getProdId() %></td>
					<td><%=p.getProdName() %></td>
					<td><%=p.getProdPrice()%></td>
					<td><%=p.getProdQty()%></td>
					
				</tr>
			</table>	
			
		<%
		}
	%>
	<h1>Bill Details</h1>
	
	<%
		bobj = (Bill) session.getAttribute("bill");
	%>
	<table>
		<tr>
			<td><%=bobj.getTotal() %></td>
			<td><%=bobj.getCgst() %></td>
		</tr>
	</table>
	
</body>
</html>