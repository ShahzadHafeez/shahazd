/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package About_Book;

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
public class Servlet_Search extends HttpServlet {

    Model_Search object=new Model_Search();
    Model_seat objectSeat=new Model_seat();
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
           
             String cityfrom=Encode.forHtmlAttribute(request.getParameter("from"));
            String cityto=Encode.forHtmlAttribute(request.getParameter("to"));
            String  seat=Encode.forHtmlAttribute(request.getParameter("number"));
            
            String classType=Encode.forHtmlAttribute(request.getParameter("class"));
            String date_d=Encode.forHtmlAttribute(request.getParameter("date_depart"));
            String date_r=Encode.forHtmlAttribute(request.getParameter("date_return"));
            
           
            
           
             if (object.SearchFlight(cityfrom,cityto,date_d))
            {
                if (objectSeat.checkseat(cityfrom, cityto, date_d, seat, classType))
                {
                   response.sendRedirect("Available.html"); 
                
                }
               out.println("seats not available");
               
            }
            else{
                response.sendRedirect("BookFailed.html");
            }
            
            
            
            
            
            
            /////////////////
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
