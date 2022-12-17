<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.model.Register"%>
    <%@page import="com.controller.DashboardController"%>
    <%@page import="java.util.List"%>
    <%@page import="java.util.ArrayList"%>
    
    
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>User Dashboard</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">

<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">

<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
<link rel="stylesheet" href="./style.css">
 
<style>

* {
  box-sizing: border-box;
}
body {
  height: 100vh;
  font-family: 'Roboto', sans-serif;
  background: linear-gradient(to top right, #7c89d5, #f599a5);
  font-size: 12px;
}
.center {
  position: absolute;
  display: block;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  width: 80vw;
  height: 88vh;
  max-width: 800px;
  display: flex;
}
.inspiration {
  position: fixed;
  bottom: 0;
  right: 0;
  padding: 10px;
  text-align: center;
  text-decoration: none;
  font-family: 'Gill Sans', sans-serif;
  color: #fff;
}
.left {
  flex: 0 0 150px;
  width: 150px;
  height: 100%;
  background-color: #fff;
  color: #848697;
  border-radius: 3px 0 0 3px;
}
.logo {
  position: relative;
  top: 10px;
  height: 100px;
}
.company {
  text-align: center;
}
.company .company-name {
  font-weight: bold;
  color: #333;
}
.company .company-description {
  position: relative;
  margin: 10px auto;
  width: 100px;
  font-size: 10px;
}
.navigation {
  position: relative;
  display: block;
  margin-top: 50px;
}
.navigation li {
  padding: 0px 25px;
  margin: 10px 0;
  display: flex;
  align-items: center;
  cursor: pointer;
}
.navigation li i {
  font-size: 20px;
}
.navigation li span {
  padding-left: 15px;
  vertical-align: super;
}
.right {
  flex: 1 1 auto;
  background-color: #f6f6fc;
  padding: 30px;
  border-radius: 0 3px 3px 0;
  overflow-x: hidden;
  overflow-y: auto;
}
.right .title {
  font-size: 25px;
  font-weight: bold;
}
.right .description {
  margin-top: 5px;
  margin-bottom: 20px;
  color: #808080;
}
.right .row {
  display: flex;
  margin: 10px 0 40px;
}
.right .row:last-child {
  margin: 10px 0 0;
}
.right .column {
  flex-direction: column;
}
.right .graph {
  display: inline-block;
  width: 250px;
  height: 150px;
  background-color: #fff;
  border-radius: 10px;
  box-shadow: 0px 0px 22px -8px #808080;
}
.right .graph .stock {
  margin: 0;
  margin-left: 20px;
  top: 5px;
}
.right .graph + .graph {
  margin-left: 10px;
}
.right .asset-category {
  display: flex;
}
.right .category {
  flex: 1;
  display: flex;
  flex-direction: column;
  align-items: center;
}
.right .asset {
  position: relative;
  display: flex;
  flex-direction: row;
  margin: 10px 0;
}
.right .asset-logo {
  position: relative;
  display: flex;
  justify-content: center;
  flex: 0;
}
.right .asset-logo:before {
  content: '';
  width: 40px;
  height: 40px;
  background-color: #fff;
  transform: rotate(45deg);
  border-radius: 10px;
}
.right .asset-logo i {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
.right .asset-name {
  color: #808080;
}
.right .sub-title {
  margin-bottom: 10px;
  color: #00008b;
}
.right .half {
  flex: 1;
}
.right .stock {
  position: relative;
  display: flex;
  flex-direction: row;
  align-items: center;
  height: 40px;
  padding: 5px 0;
  margin: 8px 0;
}
.right .stock-logo {
  position: relative;
  display: flex;
  justify-content: center;
  flex: 0;
  margin-right: 10px;
}
.right .stock-logo:before {
  content: '';
  width: 30px;
  height: 30px;
  background-color: #555;
  transform: rotate(45deg);
  border-radius: 7px;
}
.right .stock-logo i {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
.right .stock-info {
  margin-left: 5px;
  flex: 1;
}
.right .stock-name {
  color: #00008b;
}
.right .stock-fullname {
  color: #808080;
}
.right .stock-value {
  flex: 1;
  font-weight: bold;
  color: #808080;
}
.right .stock-logo.apple:before {
  background: #808080;
}
.right .stock-logo.facebook:before {
  background: #3b5998;
}
.right .stock-logo.amazon:before {
  background: #ff9b24;
}
.right .stock-logo.twitter:before {
  background: #55acee;
}
.right .stock-logo.paypal:before {
  background: #003087;
}
.right .stock-logo.google:before {
  background: #d62d20;
}
.right .stock-logo.paperpillar:before {
  background: linear-gradient(to top right, #7871ff, #6feaff);
}
.right .stock-logo.dandruft:before {
  background: linear-gradient(to top right, #f88781, #f7c682);
}
/* Style The Dropdown Button */
.dropbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
  cursor: pointer;
}

/* The container <div> - needed to position the dropdown content */
.dropdown {
  position: relative;
  display: inline-block;
}

/* Dropdown Content (Hidden by Default) */
.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

/* Links inside the dropdown */
.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

/* Change color of dropdown links on hover */
.dropdown-content a:hover {background-color: #f1f1f1}

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {
  display: block;
}

/* Change the background color of the dropdown button when the dropdown content is shown */
.dropdown:hover .dropbtn {
  background-color: #3e8e41;
}

</style>

</head>
<body>
<%! Register user = null; %>
<%	
	List<Register> lst =(ArrayList) session.getAttribute("CurrentUser");
	user = lst.get(0); 
%>

<!-- partial:index.partial.html -->
<div class="center">
  <div class="left">
    <div class="logo">
      <svg viewBox="0 0 200 400" width="100" height="100">
        <path d=" M 174.627 77.683 C 173.776 78.815 142.411 133.739 129.968 166.414 C 129.34 168.064 128.78 169.45 128.204 171.119 C 127.727 172.503 127.488 173.714 126.933 175.086 C 126.212 176.871 126.006 177.829 125.667 179.358 C 125.301 181.008 124.477 184.693 124.121 187.63 C 123.856 189.808 123.741 191.662 123.663 193.853 C 123.462 199.472 123.876 204.233 124.636 209.8 C 127.42 230.202 135.691 246.266 147.665 262.895 C 148.73 264.375 149.618 265.639 150.777 267.047 C 152.739 269.432 154.445 271.444 156.857 273.381 C 159.729 275.688 162.496 277.205 165.903 278.596 C 168.996 279.859 171.753 280.586 175.056 281.078 C 178.597 281.605 181.659 281.725 185.216 281.306 C 188.955 280.865 192.024 279.892 195.522 278.517 C 197.728 277.65 199.557 276.802 201.61 275.62 C 204.662 273.863 225.417 262.219 236.258 252.224 C 239.451 249.28 244.212 243.928 244.962 243.452 C 245.712 242.977 264.83 213.834 259.473 198.687 Q 256.513 190.317 211.583 109.026 Q 196.037 82.262 193.522 78.637 C 191.452 75.653 188.937 70.289 183.683 70.278 C 178.429 70.267 175.231 76.89 175.106 76.877 M 236.638 249.594" fill-rule="evenodd" fill="rgb(219,223,255)"></path>
        <linearGradient id="_lgradient_0" x1="93.56120204019503%" y1="13.017241572786997%" x2="89.84577303569424%" y2="99.2065293458878%">
          <stop offset="21%" stop-opacity="1" style="stop-color:rgb(185,193,255)"></stop>
          <stop offset="100%" stop-opacity="1" style="stop-color:rgb(133,158,255)"></stop>
          <stop offset="100%" stop-opacity="1" style="stop-color:rgb(185,193,255)"></stop>
        </linearGradient>
        <path d=" M 257.964 96.772 C 256.66 97.325 201.992 129.135 174.849 151.174 C 173.478 152.287 172.299 153.205 170.965 154.361 C 169.858 155.319 169.044 156.248 167.877 157.157 C 166.358 158.34 165.7 159.066 164.64 160.219 C 163.496 161.464 160.937 164.24 159.156 166.603 C 157.836 168.354 156.807 169.901 155.641 171.758 C 152.652 176.52 150.624 180.847 148.491 186.045 C 140.676 205.095 139.782 223.141 141.81 243.533 C 141.99 245.347 142.125 246.886 142.422 248.685 C 142.924 251.732 143.393 254.328 144.509 257.213 C 145.838 260.649 147.472 263.349 149.723 266.26 C 151.767 268.902 153.788 270.914 156.4 272.995 C 159.2 275.226 161.798 276.845 165.078 278.284 C 170.601 280.707 175.792 281.319 181.797 281.467 C 194.524 281.78 204.4 276.078 215.486 270.231 C 227.384 263.956 237.187 257.466 245.557 246.856 C 251.368 239.49 255.506 232.649 258.295 223.53 Q 265.443 200.163 271.169 142.865 Q 274.197 111.464 273.837 107.067 C 273.54 103.447 274.053 97.545 269.512 94.902 C 264.971 92.26 258.884 96.388 258.782 96.315 M 211.637 266.477" fill-rule="evenodd" fill="url(#_lgradient_0)"></path>
      </svg>
    </div>
    <div class="company">
      <div class="company-name"><%out.print("@"+user.getUname()); %></div>
      <div class="company-description"></div>
    </div>
    <div class="navigation">
      <ul>
        <li><i class="material-icons">store</i><span><a href="#userDetail">View User Details</a></span></li>
        <li> <i class="material-icons">track_changes</i><span><a href="#UpdateuserDetail">Update User Details</a></span></li>
        <li> <i class="material-icons">loyalty</i><span>Notification</span></li>
        <li> <i class="material-icons">forum</i><span>Message</span></li>
        <li> <i class="material-icons">library_books</i><span>News</span></li>
        <li><i class="material-icons">account_box</i><span>Account</span></li>
      </ul>
    </div>
  </div>
  
  <div class="right">
  <div class = "row">
    <div class="col">
    	<div class="title">User DashBoard</div>
    	<div class="description">Hello <%out.print(user.getName()+", "); %></div>
    </div>
    <div class="col" style="margin-left:35%; margin-right: 0%; padding-right:0%;">
    	<a href="Home.html"><button class="btn btn-link">Home</button></a>
    </div>
    <div class="col" style="margin-left:0% padding-left:0%;">
    	<a href="Home.html"><button class="btn btn-link">Logout</button></a>
    </div>
  </div>
                
    <!-- Update Java Code Here -->
    <!-- Such as user data, update, delete -->
    
    <div class="row" id="userDetail" style="font-size: 20px; background-color: ;">
		<h1 style="font-size: 25px;">User Details<hr></h1><br><br><br>
		<div>	
			<%
			{
				user = lst.get(0);
				
				//out.println("<br><br><br><h1>Name  :  "+user.getName()+"</h1>");
				
				%>
				<p><br><br><br>Name &nbsp&nbsp&nbsp&nbsp&nbsp : &nbsp&nbsp<%=user.getName() %></p>
				<br>
				<%
				//out.println("<br><h1>Email  :     "+user.getEmail()+"</h1>");
				%>
				<p><br>Email &nbsp&nbsp&nbsp&nbsp&nbsp : &nbsp&nbsp<%=user.getEmail() %></p>
				<br>
				
				<%
				//out.println("<br><h1>UserName  :  "+user.getUname()+"</h1>");
				%>
				<p><br>UserName &nbsp&nbsp : &nbsp&nbsp<%=user.getUname() %></p>
				<br>
				
				<%
				//out.println("<br><h1>Password  :  "+user.getPassword()+"</h1>");
				%>
				<p><br>Password &nbsp&nbsp : &nbsp&nbsp<%=user.getPassword() %></p>
				<br>	
			<%
			}
			%>
		</div>
    </div>
    
    
    <div class="row" id="UpdateuserDetail" style="font-size: 20px; background-color: ;">
	
		<h1 style="font-size: 25px;">Update User Details<hr></h1><br>
	</div>
  	 	<!-- Example single danger button -->
  	<div class="row">
  	 	<div class="dropdown">
		<button class="dropbtn">Select Atrribute to Update</button>
		  <div class="dropdown-content">
		    <a href="updateFrom" name="name">Name</a>
		    <a href="updateFrom" name="email">Email</a>
		    <a href="updateFrom" name="uname">UserName</a>
		    <a href="updateFrom" name="pass">Password</a>
		  </div>
		</div>
	</div>
	
	<div class="row" id="updateFrom">
			<form id="login-form" class="form" action="DashboardController" method="post" >
                <!--   <h3 class="text-center text-info">Fill the update Details</h3><br> -->
                  <div class="form-group">
                      <label for="username" class="text-info"><h2>Enter attribute to update</h2></label><br>
                      <input type="text" name="attr" id="attr" class="form-control">
                  </div>
                    <div class="form-group">
                      <label for="password" class="text-info">Enter New Value</label><br>
                      <input type="text" name="updateValue" id="password" class="form-control">
                  </div>
                  <div class="form-group">
                      <input type="submit" name="submit" class="btn btn-info btn-md" value="Update">
                  </div>
                 
             </form>
		</div>
		
		
		

    
    <div>
     
    </div>
    <!-- <div class="row">
      <div class="graph">
        <svg viewBox="0 0 250 60" width="250" height="90">
          <path d="M 209.328 17.34 C 221.956 17.588 235.264 32.599 250 22.328" fill="none" vector-effect="non-scaling-stroke" stroke-width="2" stroke="rgb(243,243,250)" stroke-linejoin="miter" stroke-linecap="round" stroke-miterlimit="3"></path>
          <linearGradient id="_lgradient_1" x1="0%" y1="50%" x2="100%" y2="50%">
            <stop offset="0%" stop-opacity="1" style="stop-color:rgb(120,113,255)"></stop>
            <stop offset="100%" stop-opacity="1" style="stop-color:rgb(111,234,255)"></stop>
          </linearGradient>
          <path d=" M 0 43.634 C 5.934 43.634 11.318 51.209 17.462 51.342 C 33.219 51.683 30.603 59.567 39.187 59.868 C 46.963 60.141 50.44 44.192 60.537 43.77 C 69.126 43.77 72.129 52.461 79.739 52.433 C 90.904 52.433 94.93 38.455 106.648 39.78 C 129.082 42.317 124.556 27.606 139.157 27.177 C 153.758 26.747 158.235 44.485 171.96 44.725 C 196.438 45.155 189.782 17.1 208.248 17.1" fill="none" vector-effect="non-scaling-stroke" stroke-width="2" stroke="url(#_lgradient_1)" stroke-linejoin="miter" stroke-linecap="round" stroke-miterlimit="3"></path>
          <path d="M 206.649 17.218 C 206.649 15.739 207.85 14.538 209.328 14.538 C 210.807 14.538 212.008 15.739 212.008 17.218 C 212.008 18.696 210.807 19.897 209.328 19.897 C 207.85 19.897 206.649 18.696 206.649 17.218 Z" fill="rgb(111,232,255)"></path>
          <text transform="matrix(1,0,0,1,195,5)" style="font-family:&amp;quot;Open Sans&amp;quot;;font-weight:700;font-size:12px;font-style:normal;fill:#6fe8ff;stroke:none;">+14%</text>
          <div class="stock">
            <div class="stock-logo paperpillar"><i class="fa fa-inverse fa-angle-double-up"></i></div>
            <div class="stock-info">
              <div class="stock-name">PPRPLR</div>
              <div class="stock-fullname">Paperpillar Studio</div>
            </div>
          </div>
        </svg>
      </div>
      <div class="graph">
        <svg viewBox="0 0 250 60" width="250" height="90">
          <path d="M 209.328 17.34 C 221.956 17.588 235.264 32.599 250 22.328" fill="none" vector-effect="non-scaling-stroke" stroke-width="2" stroke="rgb(243,243,250)" stroke-linejoin="miter" stroke-linecap="round" stroke-miterlimit="3"></path>
          <linearGradient id="_lgradient_2" x1="0%" y1="50%" x2="100%" y2="50%">
            <stop offset="0%" stop-opacity="1" style="stop-color:rgb(248, 135, 129)"></stop>
            <stop offset="100%" stop-opacity="1" style="stop-color:rgb(247, 198, 130)"></stop>
          </linearGradient>
          <path d=" M 0 43.634 C 5.934 43.634 11.318 51.209 17.462 51.342 C 33.219 51.683 30.603 59.567 39.187 59.868 C 46.963 60.141 50.44 44.192 60.537 43.77 C 69.126 43.77 72.129 52.461 79.739 52.433 C 90.904 52.433 94.93 38.455 106.648 39.78 C 129.082 42.317 124.556 27.606 139.157 27.177 C 153.758 26.747 158.235 44.485 171.96 44.725 C 196.438 45.155 189.782 17.1 208.248 17.1" fill="none" vector-effect="non-scaling-stroke" stroke-width="2" stroke="url(#_lgradient_2)" stroke-linejoin="miter" stroke-linecap="round" stroke-miterlimit="3"></path>
          <path d="M 206.649 17.218 C 206.649 15.739 207.85 14.538 209.328 14.538 C 210.807 14.538 212.008 15.739 212.008 17.218 C 212.008 18.696 210.807 19.897 209.328 19.897 C 207.85 19.897 206.649 18.696 206.649 17.218 Z" fill="rgb(247, 198, 130)"></path>
          <text transform="matrix(1,0,0,1,195,5)" style="font-family:&amp;quot;Open Sans&amp;quot;;font-weight:700;font-size:12px;font-style:normal;fill:rgb(247, 198, 130);stroke:none;">+14%</text>
        </svg>
        <div class="stock">
          <div class="stock-logo dandruft"><i class="fa fa-inverse fa-circle-thin"></i></div>
          <div class="stock-info">
            <div class="stock-name">DDFT</div>
            <div class="stock-fullname">Dandruft Craft</div>
          </div>
        </div>
      </div>
    </div>
    -->
    
    
    <!-- <div class="row column">
      <div class="sub-title">Goods</div>
      <div class="asset-category">
        <div class="category">
          <div class="asset">
            <div class="asset-logo"><i class="fa fa-bolt"></i></div>
          </div>
          <div class="asset-name">Energy</div>
        </div>
        <div class="category">
          <div class="asset">
            <div class="asset-logo"><i class="fa fa-inbox"></i></div>
          </div>
          <div class="asset-name">Gold</div>
        </div>
        <div class="category">
          <div class="asset">
            <div class="asset-logo"><i class="fa fa-clone"></i></div>
          </div>
          <div class="asset-name">Metals</div>
        </div>
        <div class="category">
          <div class="asset">
            <div class="asset-logo"><i class="fa fa-pagelines"></i></div>
          </div>
          <div class="asset-name">Grains</div>
        </div>
        <div class="category">
          <div class="asset">
            <div class="asset-logo"><i class="fa fa-adjust"></i></div>
          </div>
          <div class="asset-name">Livestock</div>
        </div>
        <div class="category">
          <div class="asset">
            <div class="asset-logo"><i class="fa fa-tencent-weibo"></i></div>
          </div>
          <div class="asset-name">Cotton</div>
        </div>
        <div class="category">
          <div class="asset">
            <div class="asset-logo"><i class="fa fa-leaf"></i></div>
          </div>
          <div class="asset-name">Corn</div>
        </div>
        <div class="category">
          <div class="asset">
            <div class="asset-logo"><i class="fa fa-tint"></i></div>
          </div>
          <div class="asset-name">Oil</div>
        </div>
      </div>
    </div>  -->
    
    <!-- 
    <div class="row">
      <div class="half">
        <div class="sub-title">Today Gainers</div>
        <div class="stock">
          <div class="stock-logo apple"><i class="fa fa-inverse fa-apple"></i></div>
          <div class="stock-info">
            <div class="stock-name">APPL</div>
            <div class="stock-fullname">Apple Inc.</div>
          </div>
          <div class="stock-value">+14.5%</div>
        </div>
        <div class="stock">
          <div class="stock-logo facebook"><i class="fa fa-inverse fa-facebook"></i></div>
          <div class="stock-info">
            <div class="stock-name">FB</div>
            <div class="stock-fullname">Facebook, Inc.</div>
          </div>
          <div class="stock-value">+12.9%</div>
        </div>
        <div class="stock">
          <div class="stock-logo amazon"><i class="fa fa-inverse fa-amazon"></i></div>
          <div class="stock-info">
            <div class="stock-name">AMZN</div>
            <div class="stock-fullname">Amazon.com, Inc.</div>
          </div>
          <div class="stock-value">+10.2%</div>
        </div>
      </div>
      <div class="half">
        <div class="sub-title">Popular this week</div>
        <div class="stock">
          <div class="stock-logo twitter"><i class="fa fa-inverse fa-twitter"></i></div>
          <div class="stock-info">
            <div class="stock-name">TWTR</div>
            <div class="stock-fullname">Twitter Inc.</div>
          </div>
          <div class="stock-value">+14.5%</div>
        </div>
        <div class="stock">
          <div class="stock-logo paypal"><i class="fa fa-inverse fa-paypal"></i></div>
          <div class="stock-info">
            <div class="stock-name">PYPL</div>
            <div class="stock-fullname">Paypal Holdings Inc.</div>
          </div>
          <div class="stock-value">+12.9%</div>
        </div>
        <div class="stock">
          <div class="stock-logo google"><i class="fa fa-inverse fa-google"></i></div>
          <div class="stock-info">
            <div class="stock-name">GOOGL</div>
            <div class="stock-fullname">Alphabet Inc.</div>
          </div>
          <div class="stock-value">+10.2%</div>
        </div>
      </div>
    </div>-->
    
  </div>
</div><a class="inspiration" href="https://dribbble.com/shots/3875272-Stock-App-Dashboard" target="_blank">inspiration  </a>
<!-- partial -->
  <script  src="./script.js"></script>

</body>

</html>