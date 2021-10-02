package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class age_cal extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/age_calculator.jsp").forward(request,response);
        return;
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age1 = "";
        age1 = request.getParameter("age");
        request.setAttribute("age", age1);
        if(age1 == null || age1.equals("")){
        request.setAttribute("error", "You must give your current age");
        getServletContext().getRequestDispatcher("/WEB-INF/age_calculator.jsp").forward(request, response);
        return;
        }
    }
}