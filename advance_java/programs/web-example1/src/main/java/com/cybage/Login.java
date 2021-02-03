package com.cybage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Login() {
        super();
       
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.print("hello");
		
		//will check username, password is correct or not
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("admin") && password.equals("admin")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			
			request.getRequestDispatcher("/welcome.jsp").forward(request, response);
			
		}else {
			response.setContentType("text/html");
//			pw.print("<h3 style c");
			request.getRequestDispatcher("/index.jsp").include(request, response);
		}
		
	}

}
