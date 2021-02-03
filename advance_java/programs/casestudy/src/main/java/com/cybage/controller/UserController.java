package com.cybage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.dao.UserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.model.User;
import com.cybage.service.UserService;
import com.cybage.service.UserServiceImpl;


public class UserController extends HttpServlet {
	
	private UserDao userDao = new UserDaoImpl();
	private UserService userService = new UserServiceImpl(userDao);
	private static final long serialVersionUID = 1L;
       
    public UserController() {
        super();
        
    }
    
   


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*PrintWriter pw = response.getWriter();
		pw.print("page is working...");*/
		
		System.out.println("insdie usercontroller");
		String path = request.getPathInfo();
		if(path.equals("/add")) {
			System.out.println("... add method");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String address = request.getParameter("address");
			
			User user = new User(username, password, address);
			try {
				int addCount = userService.addUser(user);
				if(addCount > 0){
					response.sendRedirect("list");
				}
//				response.sendRedirect("/view-user.jsp");
				/*if(added > 0) {
					
				}*/
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		if(path.equals("/list")) {
			System.out.println("inside list method");
			try {
				List<User> users = userService.findUser();
				request.setAttribute("users", users);
				request.getRequestDispatcher("/user/view-user.jsp").forward(request, response);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
