/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package About_Admin;

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
public class Servlet_New_Flight extends HttpServlet {

    getset getseter=new getset();
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
            
            
           String flight_id= Encode.forHtmlAttribute(request.getParameter("flightid"));
            
            String country_from=Encode.forHtmlAttribute(request.getParameter("countryfrom"));
            String city_from= Encode.forHtmlAttribute(request.getParameter("cityfrom"));
            
            String country_to=Encode.forHtmlAttribute(request.getParameter("countryto"));
            String city_to=Encode.forHtmlAttribute(request.getParameter("cityto"));
            
            
            String seat_business=Encode.forHtmlAttribute(request.getParameter("seat_business"));
            String price_business=Encode.forHtmlAttribute(request.getParameter("price_business"));
            
            String seat_first=Encode.forHtmlAttribute(request.getParameter("seat_first"));
            String price_first=Encode.forHtmlAttribute(request.getParameter("price_first"));
            
            String seat_economy=Encode.forHtmlAttribute(request.getParameter("seat_economy"));
            String price_economy=Encode.forHtmlAttribute(request.getParameter("price_economy"));
            
            String total_seat=Encode.forHtmlAttribute(request.getParameter("seat_total"));
            
            String flight_date=Encode.forHtmlAttribute(request.getParameter("depart_date"));
            String flight_time=Encode.forHtmlAttribute(request.getParameter("depart_time"));
            
            /*
            
            if (flight_id!=null)
            {
             out.println(flight_id);
            out.println(country_from);
            out.println(city_from);
            out.println(country_to);
            out.println(city_to);
            out.println(flight_date);
            out.println(flight_time);
            
            }
            else{
            out.println(seat_business);
            out.println(price_business);
            out.println(seat_economy);
            out.println(price_economy);
            out.println(seat_first);
            out.println(price_first);
            
                    }
            
            */
            
          
            
           getseter.setFlightID(flight_id);
           getseter.setCountryFrom(country_from);
           getseter.setCityFrom(city_from);
           getseter.setCountryTo(country_to);
           getseter.setCityTo(city_to);
           
           getseter.setFlightDate(flight_date);
           getseter.setFlightTime(flight_time);
           
         
           
           getseter.setSeatBusiness(seat_business);
           getseter.setPriceBusiness(price_business);
           getseter.setSeatFirst(seat_first);
           getseter.setPriceFirst(price_first);
           getseter.setSeatEconomy(seat_economy);
           getseter.setPriceEconomy(price_economy);
           
           getseter.setSeatTotal(total_seat);
           
          
            response.sendRedirect("adminlogout.html");
            
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
