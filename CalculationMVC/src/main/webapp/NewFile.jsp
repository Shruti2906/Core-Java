<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@page import="com.Model.*"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
        body{
			text-align: center;
            align-content: center;
		}
		
        h1 {
            color: green;
            
        }
        .container {
            padding: 15px;
            width: 500px;
            margin: 30%;
            margin-top: 2%;
        }
         
        label,
        input {
            margin-bottom: 10px;
        }
         
        button {
            float: right;
            
            background-color: green;
        }
</style>
<body>
	 <h1>Calculator</h1>
        
        <div class="container">
        <form action="CalculationController">
            <div>
                <label>no1</label>
                <input type="text" size="40" name="no1">
            </div>
            <div>
                <label>no2</label>
                <input type="text"
                       id="number" size="40" name="no2">
                <span id="error"></span>
            </div>
            <button class="" type="submit" name="btn" value="Add" style = "margin-right: 30%;">
                Add
            </button>
            <button class="" type="submit" name="btn" value="Sub">
                Sub
            </button>
            <button class="" type="submit" name="btn" value="Mul">
                Mul
            </button>
            <button class="" type="submit" name="btn" value="Div" style = "margin-left: 30%;">
                Div
            </button>
            </form>
        </div>
	
	
	
	<%! Calculation calc = null; %>
	<%
	if(!session.isNew()){
		Object o = session.getAttribute("ans");
		calc = (Calculation)o;
		out.println("Addition is : "+calc.getSum());
	}
	session.invalidate();
	%>
		<!-- <table>
			<tr><td>//<%--= calc.getNo1() %>--%></td>
				<td><%--<%= calc.getNo2() %>--%></td>
				<td><%--<%= calc.getSum() %>--%></td>
			</tr>	
		</table>-->
	
	
</body>
</html>