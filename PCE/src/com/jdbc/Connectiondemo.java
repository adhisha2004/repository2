package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectiondemo {

	public static void main(String[] args)throws Exception {
		String url = "jdbc:mysql://localhost:3306/schooldb";
		String user = "root";
		String pass = "Adhisha";
		
		//Loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Scuccessfully");
		
		//Connection Established
		Connection con = DriverManager.getConnection(url,user,pass);
		System.out.println("Connection Established");

	}

}
