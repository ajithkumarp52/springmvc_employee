package org.dxc.employee.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DBConnection {
	private static Connection connection;
	private static Logger logger=Logger.getLogger(DBConnection.class.getName());
	public static Connection getSqlConnection() {
	//step 1 : load the JDBC Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			logger.info("Driver loaded successfully");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			//step 2 & 3 : define url and Establish connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
			logger.info("Connection Object is Created Successfully");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return connection;
	}

}
