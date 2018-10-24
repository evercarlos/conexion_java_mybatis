/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecr.servlet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ecr.beans.ProfileBean;
import ecr.pojos.Profile;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "ProfileServlet", urlPatterns = {"/profiles"})
public class ProfileServlet extends HttpServlet {

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
          String respuesta = request.getParameter("url") == null ? "" : request.getParameter("url");
         // System.out.println("hola "+respuesta);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
              switch (respuesta) {
                case "list":
                    all(request, response);
                    break;
                case "create":
                      create(request, response);
                    break;
               case "update":
                     update(request, response);
                    break;
                case "delete":
                     destroy(request, response);
                    break;
                default:
                    index(request, response);
                    break;
            }
        }
    }
    
    private void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("./view/profiles/index.jsp").forward(request, response);
    }
  
    private void all(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        /*String request_method = request.getParameter("url") == null ? "" : request.getParameter("url");
        String jtStartIndex = request.getParameter("jtStartIndex") == null ? "" : request.getParameter("jtStartIndex");
        String jtPageSize = request.getParameter("jtPageSize") == null ? "" : request.getParameter("jtPageSize");
        String search = request.getParameter("search") == null ? "" : request.getParameter("search");
       String jtSorting = request.getParameter("jtSorting") == null ? "" : request.getParameter("jtSorting");*/
       
          Gson gson = new Gson();
         // List<ProfileBean> items = (List<ProfileBean>) new ArrayList<ProfileBean>();// con ArrayList= Sirve para acceder a elementos
           /*items.add(new Profile(1,"Ever Carlos Rojas"));
            items.add(new Profile(2,"Luis Carlos Rojas"));
            items.add(new Profile(3,"Piter Carlos Rojas"));
            items.add(new Profile(4,"Rosman Carlos De la Cruz"));
            items.add(new Profile(5,"Abner Campojo"));*/     
            String search_ = "";
            String cate = "";
            String query= "";
            
            String query1 =query;
            String q1 = query1;

            String value = request.getParameter("search");   
           if (!value.equals("")) {
                search_ = value;/*"where perfiles.description ilike '%" + value + "%'";*/
                query = search_;
           }
         
  
            HashMap params_ = new HashMap();
            params_.put("q", search_);
            params_.put("limit", Integer.parseInt(request.getParameter("jtPageSize")));
            params_.put("start", Integer.parseInt(request.getParameter("jtStartIndex")));
       
            //int count_=new ProfileBean().getAll(params_).size();
               System.out.println(query);
            HashMap outHash = new HashMap(); // HashMap= Sirve para asociación clave valor
            outHash.put("Result", "OK");
            outHash.put("TotalRecordCount", new ProfileBean().getCount(query));
            outHash.put("Records", new ProfileBean().getAll(params_));
         
            response.getWriter().print(gson.toJson(outHash));
        
    }
    
    private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Gson gson = new Gson(); 
       /* Profile obj= new Profile();
        obj.setDescription("ever");
        new ProfileBean().create();*/
        HashMap data_ = new HashMap();
        String description_ = request.getParameter("description");
        data_.put("description",description_);   
        new ProfileBean().create(data_);
        
        HashMap outHash = new HashMap();
        outHash.put("Result", "OK");
        outHash.put("Record", "[]");
        response.getWriter().print(gson.toJson(outHash));
        
    }
    
    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Gson gson = new Gson(); 
       /* Profile obj= new Profile();
        obj.setDescription("ever");
        new ProfileBean().create();*/
        HashMap data_ = new HashMap();
        String description_ = request.getParameter("description");
        Integer id_= Integer.parseInt(request.getParameter("id"));
        data_.put("id",id_);  
        data_.put("description",description_);  
       new ProfileBean().update(data_);
        
        HashMap outHash = new HashMap();
        outHash.put("Result", "OK");
        response.getWriter().print(gson.toJson(outHash));
        
    }
    
    private void destroy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Gson gson = new Gson(); 
        Integer id_= Integer.parseInt(request.getParameter("id"));  
        System.out.println(id_);
         HashMap data_ = new HashMap();
         data_.put("id",id_);
        new ProfileBean().destroy(data_);
        
        HashMap outHash = new HashMap();
        outHash.put("Result", "OK");
        response.getWriter().print(gson.toJson(outHash));
        
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
