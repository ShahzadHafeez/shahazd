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
public class Model_seat {
    
    
   public boolean checkseat(String from,String to,String depart,String seat,String type)
    {
        String no=" ";
        boolean prog=false;
        try{
        String host;
        host = "jdbc:derby://localhost:1527/mydb";
        String un="shahzad";
        String pas="hafeez";
        
        Connection con = DriverManager.getConnection( host, un, pas );
        
        Statement stmt = con.createStatement( );
  
        String SQL = "SELECT *FROM FLIGHTS WHERE CITYFROM='"+from+"' AND CITYTO='"+to+"' AND DATE='"+depart+"' ";
        ResultSet rs = stmt.executeQuery( SQL );
    
//       while (rs.next())
//              {
//                 String a;
//                 a=(rs.getString(1));
//                 System.out.println(a); 
//               }

       rs.next();
        if (type.equals("first"))
        {
            no=(rs.getString("SEATFIRST"));
        } 
        else if (type.equals("business")) {
            
             no=(rs.getString("SEATBUSINESS"));
            }
        else{
             no=(rs.getString("SEATECONOMY"));
            
        }
         
         
        
               
        
         int result = Integer.parseInt(no);
         int set=Integer.parseInt(seat);
     
         if (result-set>=0){
             prog=true;
         }
        
        
       
        
        }
        catch ( SQLException err ) {
          System.out.println( err.getMessage( ) );
        }
        
        
        
        
        
        return prog;
    }
    
    
    
    
}
