/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package About_Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Shahzad Hafeez
 */
public class Model_Transaction {
    
     public Connection connect()
    {
        try {
            String host="jdbc:derby://localhost:1527/mydb";
            String uname="shahzad";
            String pass="hafeez";
        
            return DriverManager.getConnection(host,uname,pass);
        } catch (SQLException e) {
            return null;
        }
    }
    
public boolean book_information(String user_gender,String first_name,String last_name,String passport_number,
            String phone_number,String credit_number,String user_email,String user_country,String city_from,String city_to, 
            String depart_date,String return_date)
    {
        Connection conn=connect();
        boolean prog=false;
        
        if (conn!=null)
        {
            //////////////
            try {
                
           
          
            
              String SQL = "INSERT INTO BOOKED ("
                                + " GENDER,"
                                + " FIRSTNAME,"
                                + " LASTNAME,"
                                + " PASSPORTNUMBER,"
                                + " PHONENUMBER,"
                                + " CREDITCARDNUMBER,"
                                + " EMAIL,"
                                + " COUNTRY,"
                                + " CITYFROM,"
                                + " CITYTO,"
                                + " DEPARTUREDATE,"
                                + " RETURNDATE) VALUES ("
                                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
              PreparedStatement pstmt=conn.prepareStatement(SQL);
              
              pstmt.setString(1, user_gender);
              pstmt.setString(2, first_name);
              pstmt.setString(3, last_name);
              pstmt.setString(4, passport_number);
              pstmt.setString(5, phone_number);
              pstmt.setString(6, credit_number);
              pstmt.setString(7, user_email);
              pstmt.setString(8, user_country);
              pstmt.setString(9, city_from);
              pstmt.setString(10, city_to);
              pstmt.setString(11, depart_date);
              pstmt.setString(12, return_date);
             
              pstmt.executeUpdate();
             
              prog=true;
              
            }
              catch (SQLException e) {
                  prog=false;
            }
            
            
            //////////////////
        }
        
       return prog;
    }
    
    
    
    
    
    
    
}
