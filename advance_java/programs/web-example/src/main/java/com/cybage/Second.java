package com.cybage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String username;

	public Second() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.print("<h1>this is a second get method</h1>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		username = request.getParameter("username");
		System.out.println("from second:" + username);

		PrintWriter out = response.getWriter();
		out.print("<h1>this is a second post method</h1>");
		out.close();

	}

}
