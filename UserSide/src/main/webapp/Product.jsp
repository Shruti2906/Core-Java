<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
</head>
<body>


	<form action="ProductServlet">
		<table>
			<tr>
				<td>Product Id </td>
				<td><input type="text" name="prodId"></td>
			</tr>
			<tr>
				<td>Product Name </td>
				<td><input type="text" name="prodName"></td>
			</tr>
			<tr>
				<td>Product Price </td>
				<td><input type="text" name="prodPrice"></td>
			</tr>
			<tr>
				<td>Product Qty </td>
				<td><input type="text" name="prodQty"></td>
			</tr>
			<tr>
				<td>Submit </td>
				<td><Button type="submit" name="submit">Submit</Button></td>
			</tr>
		</table>
	
	</form>

</body>
</html>