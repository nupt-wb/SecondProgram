package com.nupt.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adminLogin")
public class AdminLoginController extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response){
		
		//后台管理员登录
		//1.验证
		//2.通过用户名和密码到数据库进行查找
		/*SELECT 
		COUNT(1) 
		FROM USER AS u 
		JOIN userauth AS ua ON u.id=ua.userid
		JOIN authority AS r ON ua.authid = r.id 
		WHERE r.auth ='superadmin' AND u.name=? AND PASSWORD=?*/
		
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/admin/center.jsp");
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
