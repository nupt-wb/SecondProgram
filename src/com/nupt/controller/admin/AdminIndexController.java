package com.nupt.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adminIndex")
public class AdminIndexController extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response){
		RequestDispatcher rd = request.getRequestDispatcher("adminIndex.jsp");
		try {
			rd.forward(request,response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response){
		doGet(request,response);
	}
}
