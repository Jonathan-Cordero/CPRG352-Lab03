/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class arithmetic_cal extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmetic_calculator.jsp").forward(request,response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstnum = request.getParameter("first_num");
        String secondnum = request.getParameter("second_num");
        
        request.setAttribute("num1", firstnum);
        request.setAttribute("num2", secondnum);
        String get = request.getParameter("calc");
        
        int total = 0;
        
        if(firstnum == null || secondnum == null || firstnum == "" || secondnum == ""){
            request.setAttribute("error", "---");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmetic_calculator.jsp").forward(request, response);
            return;
        }
        
        int actualfirstnum = Integer.parseInt(firstnum);
        int actuallasttnum = Integer.parseInt(secondnum);
        
        if (get.equals("plus")){
            total = actualfirstnum + actuallasttnum;
            request.setAttribute("error", total);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmetic_calculator.jsp").forward(request, response);
            return;
        }
        else if (get.equals("minus")){
            total = actualfirstnum - actuallasttnum;
            request.setAttribute("error", total);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmetic_calculator.jsp").forward(request, response);
            return;
        }
        else if (get.equals("multiply")){
            total = actualfirstnum * actuallasttnum;
            request.setAttribute("error", total);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmetic_calculator.jsp").forward(request, response);
            return;
        }
        else if (get.equals("mod")){
            total = actualfirstnum % actuallasttnum;
            request.setAttribute("error", total);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmetic_calculator.jsp").forward(request, response);
            return;
        }
    }
}
