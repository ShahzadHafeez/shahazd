/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package About_Transaction;

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
public class Servlet_Transaction extends HttpServlet {
    setemail setter=new setemail();
    Model_Transaction object=new Model_Transaction();
    Model_reduceSeats obj_Model_reduceSeats=new Model_reduceSeats();
    
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
           
            
            
            String gender=Encode.forHtmlAttribute(request.getParameter("gender"));
            String firstName=Encode.forHtmlAttribute(request.getParameter("fname"));
            String lastName=Encode.forHtmlAttribute(request.getParameter("lname"));
            
            String passportNumber=Encode.forHtmlAttribute(request.getParameter("passNo"));
            String phoneNumber=Encode.forHtmlAttribute(request.getParameter("phoneNo"));
            String creditNumber=Encode.forHtmlAttribute(request.getParameter("creditNo"));
            
            String email=Encode.forHtmlAttribute(request.getParameter("email"));
            String country=Encode.forHtmlAttribute(request.getParameter("country"));
            String cityFrom=Encode.forHtmlAttribute(request.getParameter("from"));
            String cityTo=Encode.forHtmlAttribute(request.getParameter("to"));
            
            String departDate=Encode.forHtmlAttribute(request.getParameter("dedate"));
            String returnDate=Encode.forHtmlAttribute(request.getParameter("redate"));
            
            
            
            
            setter.setGender(gender);
            setter.setFirstName(firstName);
            setter.setLastName(lastName);
            setter.setPassportNo(passportNumber);
            setter.setPhoneNo(phoneNumber);
            setter.setCreditNo(creditNumber);
            
            setter.setEmail(email);
            setter.setCountry(country);
            setter.setCityFrom(cityFrom);
            setter.setCityTo(cityTo);
            
            setter.setDepartDate(departDate);
            setter.setReturnDate(returnDate);
            /*
            out.println(gender);
            out.println(firstName);
            out.println(lastName);
            out.println(passportNumber);
            out.println(phoneNumber);
            out.println(creditNumber);
            out.println(email);
            out.println(country);
            out.println(cityFrom);
            out.println(cityTo);
            out.println(departDate);
            out.println(returnDate);
            */
            
            
            if(object.book_information(gender, firstName, lastName, passportNumber, phoneNumber, creditNumber, email, country, cityFrom, cityTo, departDate, returnDate))
            {
                
                
                response.sendRedirect("SuccesfullyRegistered.html");
                //response.sendRedirect("email.jsp");
            }
            else
                out.println("error in model_transection");
        
            
            
            //////////////////
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
