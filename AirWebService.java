/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.sql.DataSource;


/**
 *
 * @author Shahzad Hafeez
 */
@WebService(serviceName = "AirWebService")
public class AirWebService {

    @Resource(name = "mydb")
    private DataSource mydb;
    

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getPrice")
    public double getPrice(@WebParam(name = "Origion") String Origion, @WebParam(name = "Destination") String Destination) {
        try {
            //TODO write your implementation code here:

            Connection con=mydb.getConnection();
            PreparedStatement psmt = con.prepareStatement("select * from flights where cityfrom='"+Origion+"' and cityto='"+Destination+"'");
            
        
            ResultSet rs=psmt.executeQuery();
            rs.next();
            
            String price=rs.getString(11);
            double resul = Double.parseDouble(price);
          
            rs.close();
            con.close();
        
            return resul;
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return 0.0;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getSeats")
    public int getSeats(@WebParam(name = "Flight_No") String Flight_No, @WebParam(name = "Flight_Date") String Flight_Date) {
       
        try {
            //TODO write your implementation code here:

            Connection con=mydb.getConnection();
            PreparedStatement psmt = con.prepareStatement("select * from flights where flight_id='"+Flight_No+"' and date='"+Flight_Date+"'");
            
        
            ResultSet rs=psmt.executeQuery();
            rs.next();
            
            String seat=rs.getString(10);
            int res=Integer.parseInt(seat);
            
          
            rs.close();
            con.close();
        
            return res;
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return 0;
        }
        
        
        
    }
}
