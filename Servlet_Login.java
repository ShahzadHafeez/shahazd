/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package About_Login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.parser.TokenType;
import org.owasp.encoder.Encode;

/**
 *
 * @author Shahzad Hafeez
 */
public class Servlet_Login extends HttpServlet {

    Model_Login obj=new Model_Login();
    
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
            
            
             String utype = Encode.forHtmlAttribute(request.getParameter("type"));
            String username = Encode.forHtmlAttribute(request.getParameter("uname"));
            String email= Encode.forHtmlAttribute(request.getParameter("email"));
            String pass=Encode.forHtmlAttribute(request.getParameter("password"));
            
            /*
            out.println(utype);
            out.println(username);
            out.println(email);
            out.println(pass);
            */
            
            
             if(obj.LogIn(username,email, pass,utype))
             {
                 
                 switch (utype) {
                    case "admin":
                        response.sendRedirect("admin.html");
                        break;
                    case "manager":
                        if (About_Admin.getset.getSeatBusiness()!=null){
                        response.sendRedirect("Manager.jsp");
                        break;
                        }else{
                            response.sendRedirect("Managerno.html");
                            break;
                        }
                        
                    default:
                         response.sendRedirect("index.html");
                        break;
                }
                 
             }
             else
                  response.sendRedirect("loginfailed.html");
            
            
            
            
            
            /////////////
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
