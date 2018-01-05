/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package About_Manager;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.owasp.encoder.Encode;

/**
 *
 * @author Shahzad Hafeez
 */
public class Servlet_Manager extends HttpServlet {

    Model_Manager objManager=new Model_Manager();
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            
            
            String Flight_ID=About_Admin.getset.getFlightID();
            String CountryFrom=About_Admin.getset.getCountryFrom();
            String CityFrom=About_Admin.getset.getCityFrom();
            
            String CountryTo=About_Admin.getset.getCountryTo();
            String CityTo=About_Admin.getset.getCityTo();
            
            String SeatBusiness=About_Admin.getset.getSeatBusiness();
            String PriceBusiness=About_Admin.getset.getPriceBusiness();
            
            String SeatFirst=About_Admin.getset.getSeatFirst();
            String PriceFirst=About_Admin.getset.getPriceFirst();
            
            String SeatEconomy=About_Admin.getset.getSeatEconomy();
            String PriceEconomy=About_Admin.getset.getPriceEconomy();
            
            String TotalSeat=About_Admin.getset.getSeatTotal();
            String Date=About_Admin.getset.getFlightDate();
            String Time=About_Admin.getset.getFlightTime();
            
            
             out.println(Flight_ID);
             
             out.println(CountryFrom);
             out.println(CityFrom);
             
             out.println(CountryTo);
             out.println(CityTo);
             
             out.println(SeatBusiness);
             out.println(PriceBusiness);
             
             out.println(SeatFirst);
             out.println(PriceFirst);
             
             out.println(SeatEconomy);
             out.println(PriceEconomy);
             
             
             out.println(TotalSeat);
             out.println(Date);
             out.println(Time);
         
            
         
            
            if (objManager.setFlight(Flight_ID,CountryFrom,CityFrom, CountryTo, CityTo, SeatBusiness, PriceBusiness, SeatFirst, PriceFirst, SeatEconomy, PriceEconomy, TotalSeat, Date, Time))
            {
               // response.sendRedirect("Managerlogout.html");
            }
            else{
                out.println("not data inserted");
            }
            
            
            /////////////////////
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
