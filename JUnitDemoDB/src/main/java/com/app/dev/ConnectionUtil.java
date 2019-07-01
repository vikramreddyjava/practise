package com.app.dev;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class ConnectionUtil {
	private static Connection con = null;
	static{
	try {
	Class.forName(getProperties().getProperty("dc"));
	con=DriverManager.getConnection(getProperties().getPrope
	rty("url"),
	getProperties().getProperty("un"),
	getProperties().getProperty("pwd"));
	} catch (Exception e) {
	e.printStackTrace();
	}
	}

	public static Connection getSingeltonConnection() {
		return con;
	}

}
