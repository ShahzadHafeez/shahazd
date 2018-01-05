/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package About_Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Shahzad Hafeez
 */
public class Model_Login {
    
    
    
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
      
      public boolean LogIn(String unameString,String emailString,String pass,String type)
    {
        Connection con=connect();
        boolean prog=false;
       
        if(con!=null)
        {
            try {
                Statement stmnt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                ResultSet rs=stmnt.executeQuery("select * from login where uname='"
                        +unameString+"' and pass='"+pass+"' and email='"+emailString+"' and utype='"+type+"'" );
                rs.next();
                String mame=rs.getString("uname");
                prog=true;
            } catch (SQLException e) {
                System.err.println(e);
                prog=false;
            }
        }
        return prog;
    }

    boolean login(String username, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
