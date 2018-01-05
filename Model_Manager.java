/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package About_Manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Shahzad Hafeez
 */
public class Model_Manager {
    
    /////////////
    
    
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
    
    public boolean setFlight(String id,String countryf,String cityf,String countryt,String cityt,
                          String seatb,String priceb,String seatf,String pricef,String seate, String pricee,
                          String total,String date_f, String time_f)
    {
         Connection con=connect();
         boolean prog=false;
         
         if (con!=null)
         {
             try{
             String SQL= "INSERT INTO FLIGHTS ("
                                + " FLIGHT_ID,"
                                + " COUNTRYFROM,"
                                + " CITYFROM,"
                                + " COUNTRYTO,"
                                + " CITYTO,"
                                + " SEATBUSINESS,"
                                + " PRICEBUSINESS,"
                                + " SEATFIRST,"
                                + " PRICEFIRST,"
                                + " SEATECONOMY,"
                                + " PRICEECONOMY,"
                                + " TOTALSEAT,"
                                + " DATE,"
                                + " TIME) VALUES ("
                                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
             
             
             
             PreparedStatement stm=con.prepareStatement(SQL);
              
              stm.setString(1, id);
              stm.setString(2, countryf);
              stm.setString(3, cityf);
              stm.setString(4, countryt);
              stm.setString(5, cityt);
              stm.setString(6, seatb);
              stm.setString(7, priceb);
              stm.setString(8, seatf);
              stm.setString(9, pricef);
              stm.setString(10, seate);
              stm.setString(11, pricee);
              stm.setString(12,total);
              stm.setString(13,date_f);
              stm.setString(14,time_f);
             
              stm.executeUpdate();
             
              prog=true;
             
             }
              catch (SQLException e) {
                  prog=false;
              }
                    
         }
         return prog;
         }
         
    }
    
