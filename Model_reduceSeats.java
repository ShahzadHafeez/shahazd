/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package About_Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Shahzad Hafeez
 */
public class Model_reduceSeats {
    
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
    
    
    public boolean reduceSeat()
    {
        Connection con=connect();
        boolean val=false;
        
        
        if (con!=null)
        {

        }
        
        
        
        return val;
    }
    
    
    
    
    
}
