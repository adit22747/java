package com.cybage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/Second")
public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Second() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		pw.print("second servlet get\n");
//		Cookie[] cookies = request.getCookies();
//		pw.print("username:" + cookies[1].getValue());
//		
//		for (Cookie cookie : cookies) {
//			if(cookie.getName().equals("un")) {
//				pw.print("username:" + cookie.getValue());
//			}
//		}
		
		HttpSession session = request.getSession();
		pw.print("Welocme:" + session.getAttribute("username"));
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		pw.print("second servlet post");
		
		
	}

}
