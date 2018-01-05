<%-- 
    Document   : Manager
    Created on : Oct 25, 2017, 1:16:06 PM
    Author     : Shahzad Hafeez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Manager</title>
	<meta charset="utf-8">
	<meta name="author" content="pixelhint.com">
	
	
</head>

<style>


body{ 

 background-image:url("lll.jpg");
  
 }  




.footer{
	
	width: 100%;
    background-color: #404040;
}




</style>
<body>


<header>
<p> 
<img src="img/icon2.png" style="float:left; width:60px; height:60px;">
<br>
 &emsp;
<strong>Tiger Airline</strong>
<br>
connecting world
</p>

<div class="footer">

<h1 style ="color:white;text-align:center; padding:10px;"> Manager</h1>

</div>
</header>
    <br/>
    <p style="color:red;">Admin Has Sent Following Data:</p>    
        <p style="text-align:center;font-size: 20px;">Flight ID is :  
        <%= About_Admin.getset.getFlightID()%>
        </p>
        <hr>
        
         <p style="text-align:center; font-size: 20px;">Country From :  
        <%= About_Admin.getset.getCountryFrom()%>
        </p>
        <hr>
        
         <p style="text-align:center; font-size: 20px;">City From :
        <%= About_Admin.getset.getCityFrom()%>
        </p>
        <hr>
         <p style="text-align:center; font-size: 20px;">Country To :
         <%=About_Admin.getset.getCountryTo()%>
        </p>
        <hr>
         <p style="text-align:center; font-size: 20px;">City To :
         <%=About_Admin.getset.getCityTo()%>
        </p>
        <hr>
        <p style="text-align:center; font-size: 20px;">Business Class:</p>
        <p style="color:red; text-align: center;">Seats :
         <%=About_Admin.getset.getSeatBusiness()%>
        </p>
         <p style="color:red; text-align: center;">Price :
         <%=About_Admin.getset.getPriceBusiness()%> $
        </p>
        <hr>
        <p style="text-align:center; font-size: 20px;">First Class:</p>
        <p style="color:red; text-align: center;">Seats :
         <%=About_Admin.getset.getSeatFirst()%>
        </p>
         <p style="color:red; text-align: center;">Price :
         <%=About_Admin.getset.getPriceFirst()%> $
        </p>
        <hr>
         <p style="text-align:center; font-size: 20px;">Economy Class:</p>
        <p style="color:red; text-align: center;">Seats :
         <%=About_Admin.getset.getSeatEconomy()%>
        </p>
         <p style="color:red; text-align: center;">Price :
         <%=About_Admin.getset.getPriceEconomy()%> $
        </p>
        <hr>
         <p style="text-align:center; font-size: 20px;">Total Seats :
         <%=About_Admin.getset.getSeatTotal()%>
        </p>
        <hr>
        <p style="text-align:center; font-size: 20px;">Date of Flight Departure :
         <%=About_Admin.getset.getFlightDate()%>
        </p>
        <hr>
        <p style="text-align:center; font-size: 20px;">Time of Flight Departure :
         <%=About_Admin.getset.getFlightTime()%>
        </p>
        <hr>
        <hr>
        <h style="text-align:center;color:blue; font-size: 25px;">Are You Want to Proceed:
        <form action="Servlet_Manager" method="post">
        <button style="background-color:green;color:white;font-size: 25px; " type="submit" value="submit">Proceed</button>
        </form>
        <br>
        <form action="login.html">
        <button style="background-color:red;color:white;font-size: 25px; " type="submit" value="submit">Cancel</button>
         </form>
  
       </h>
  
<footer>

<div class="footer">



<p style ="color:white;">
&emsp; 
<img src="img/icon2.png" style="float:left; width:60px; height:60px;">
<br>
 &emsp;
<strong>Tiger Airline</strong>
<br>

connecting world

</p>




<p style ="color:white;text-align:center;"> all rights reserved.</p>

</div>
</footer>
  
    
</html>
