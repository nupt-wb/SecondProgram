package com.nupt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserMapper {
	private String url = "jdbc:mysql://localhost:3306/test";
	private String user = "root";
	private String password ="123123";
	
	
	public int isUser(){
		int ret = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			//加载
			Class.forName("com.mysql.jdbc.Driver");
			//连接
			conn = DriverManager.getConnection(url,user,password);
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return ret;
	}
	
	
	public int existsUser(){
		int ret = 0;
		return ret;
	}
}
