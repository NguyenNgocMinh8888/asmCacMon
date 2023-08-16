package controllers.admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class validate {
    public class FormPost extends HttpServlet
    {
        protected void service(HttpServletRequest request,
                               HttpServletResponse responst) throws ServletException, IOException
        {

            if(request.getParameter("name") != null){
                String nameParameter = request.getParameter("name");
            } else {
                request.setAttribute("CTSPERORR", "Khong dc de trong");
            }

            int ageParameter = Integer.parseInt(request.getParameter("age"));



        }

    }
}
