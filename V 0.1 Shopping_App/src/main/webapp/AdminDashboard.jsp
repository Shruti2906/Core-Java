<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<head>
<title>Admin Dashboard</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<style>
body {
  margin: 0;
  padding: 0;
  
  background: linear-gradient(to top right, #7c89d5, #f599a5);
  height: 100vh;
}
#login .container #login-row #login-column #login-box {
  margin-top: 120px;
  max-width: 600px;
  height: 320px;
  border: 1px solid #9C9C9C;
  background-color: #EAEAEA;
}
#login .container #login-row #login-column #login-box #login-form {
  padding: 20px;
}
#login .container #login-row #login-column #login-box #login-form #register-link {
  margin-top: -85px;
}
</style>
</head>

<body>
	
	
	
	<!-- <a href="ProductView.jsp">Add Product</a><br>
	<a href="SearchProduct.jsp">Search Product</a><br>
	<a href="DisplayAllController">View All Product</a><br>
	<a href="DeleteProduct.jsp">Delete Product</a><br>
	 -->
	 
	 <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <a class="navbar-brand" href="#">Admin Dashboard</a>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link" href="Home.html">Logout <span class="sr-only">(current)</span></a>
      </li>
     <!-- <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
       <li class="nav-item">
        <a class="nav-link disabled" href="#">Disabled</a>
      </li>  -->
    </ul>
   
    <form class="form-inline my-2 my-lg-0">
      <button class="btn btn-outline-success mr-sm-2" type=""><a href="Home.html">Home</a></button>
      <button class="btn btn-outline-success my-2 my-sm-0" type=""><a href="WorkInProgress.jsp">Profile</a></button>
    </form>
  </div>
</nav>
	 
		 <h2 class="text-center text-white pt-5">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspAdmin Services</h2>
	<div style="margin-left:45%; margin-right:45%; margin-top:10%; border: ; width:15%;">
		
		<div class="row" style="text-align: center;align-content: center; margin:1%; margin-left:3%; margin-right:3%; width:85%; border: ;">
			<a href="ProductView.jsp" style="width:100%;"><button type="button" class="btn btn-light" style="width:100%;">Add Product</button></a>
		</div>
		<div class="row" style="text-align: center;align-content: center; margin:3%; width:85%; border: ;">
			<a href="SearchProduct.jsp" style="width:100%;"><button type="button" class="btn btn-light" style="width:100%;">Search Product</button></a>
		</div>
		<div class="row" style="text-align: center;align-content: center; margin:3%; width:85%; border: ;">
			<a href="DisplayAllController" style="width:100%;"><button type="button" class="btn btn-light " style="width:100%;">View All Product</button></a>
		</div>
		<div class="row" style="text-align: center;align-content: center; margin:3%; width:85%; border: ;">
			<a href="DeleteProduct.jsp" style="width:100%;"><button type="button" class="btn btn-light " style="width:100%;">Delete Product</button></a>
		</div>
		<!-- <div class="row" style="text-align: center;align-content: center; margin:3%; width:85%; border: ;">
			<a href="Home.html" style="width:100%;"><button type="button" class="btn btn-light " style="width:100%;">Delete Product</button></a>
		</div>
		<div class="row" style="text-align: center;align-content: center; margin:3%; width:85%; border: ;">
			<a href="DeleteProduct.jsp" style="width:100%;"><button type="button" class="btn btn-light " style="width:100%;">Logout</button></a>
		</div> -->
	</div>
	
	

</body>
</html>