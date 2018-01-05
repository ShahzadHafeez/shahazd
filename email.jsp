<%-- 
    Document   : email
    Created on : Nov 5, 2017, 12:52:41 PM
    Author     : Shahzad Hafeez
--%>
<%@page import="About_Transaction.setemail"%>
<%@ page import="java.util.*, javax.mail.*, javax.mail.internet.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String m1=setemail.getFirstName(); %>
       <% String m2=setemail.getLastName();%>
       <% String m3=setemail.getCityFrom(); %>
       <% String m4=setemail.getCityTo();%>
       <% String m5=setemail.getPassportNo(); %>
       <% String m6=setemail.getDepartDate(); %>
      
       
       
        <%
            String a1="First Name is = ";
            String a2="Last Name is = ";
            String a3="Departure City is = ";
            String a4="Destination City is = ";
            String a5="Passport Number is = ";
            String a6="Departure Date is = ";
			
            String host = "alt4.aspmx.l.google.com";
    String user = "alt4.aspmx.l.google.com";
    String pass = "shahzad78DMT";
    String to = "l154293@lhr.nu.edu.pk";
    String from = "shahzadhafeez712@gmail.com";
    String subject = "Tiger Airline";
   
    
    boolean sessionDebug = false;
    
    Properties props = System.getProperties();
    props.put("mail.host", host);
    props.put("mail.transport.protocol", "smtp");
props.put("mail.smtp.auth", "true");
    // props.put("mail.smtp.port", 26);
    // Uncomment 5 SMTPS-related lines below and comment out 2 SMTP-related lines above and 1 below if you prefer to use SSL
// props.put("mail.transport.protocol", "smtps");
// props.put("mail.smtps.auth", "true");
    // props.put("mail.smtps.port", "465");
    // props.put("mail.smtps.ssl.trust", host);
    Session mailSession = Session.getDefaultInstance(props, null);
    mailSession.setDebug(sessionDebug);
    Message msg = new MimeMessage(mailSession);
    msg.setFrom(new InternetAddress(from));
    InternetAddress[] address = {new InternetAddress(to)};
    msg.setRecipients(Message.RecipientType.TO, address);
    msg.setSubject(subject);
    msg.setSentDate(new Date());
    msg.setText(a1+m1+" "+a2+m2+" "+a3+m3+" "+a4+m4+" "+a5+m5+" "+a6+m6+" ");
    Transport transport = mailSession.getTransport("smtp");
// Transport transport = mailSession.getTransport("smtps");
transport.connect(host, user, pass);
    transport.sendMessage(msg, msg.getAllRecipients());
    transport.close();
    
    %>
        
    <h>Email Has been sent Successfully</h>    
    </body>
</html>
