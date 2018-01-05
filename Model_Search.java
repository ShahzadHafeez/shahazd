/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package About_Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Shahzad Hafeez
 */
public class Model_Search {
    
    
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
    
    
    public boolean SearchFlight(String from,String to,String date_depart)
    {
        Connection con1=connect();
        boolean val=false;
        
        
        if (con1!=null)
        {
            try {
                
            
                Statement stmnt1=con1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                            
                ResultSet rs=stmnt1.executeQuery("select * from flights where cityfrom='"
                        +from+"' and cityto='"+to+"' and date='"+date_depart+"' ");
                
            rs.next();
                String mString=rs.getString("cityfrom");
                val=true;
        }
            catch(SQLException e)
                    {
                        System.err.println(e);
                        val=false;
                    }
            
            
        }
        
           return val;
        
    }
    
    
    
    
    
    
    
    
    
    
}
