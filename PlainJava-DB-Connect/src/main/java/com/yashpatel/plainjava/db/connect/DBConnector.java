/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yashpatel.plainjava.db.connect;

import static java.rmi.server.LogStream.log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yash Patel
 */
public class DBConnector {
    
     private static Connection myconn = null;
    
    public static Connection makeJDBCConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Ok  you have JDBC driver registered");
		} catch (ClassNotFoundException e) {
			System.out.println("Sorry, couldn't found JDBC driver. Make sure you have added JDBC Maven Dependency Correctly");
			e.printStackTrace();
			return null;
		}
		try {
			// DriverManager: The basic service for managing a set of JDBC drivers.
                        PasswordManager passwordManager = new PasswordManager();
                        
			myconn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/yashdatabase", passwordManager.getUsername(),passwordManager.getPassword());
			if (myconn != null) {
				System.out.println("Connection Successful! Enjoy. Now it's time to push data");
                                return myconn;
			} else {
				System.out.println("Failed to make connection!");
			}
		} catch (SQLException e) {
			System.out.println("MySQL Connection Failed!");
			e.printStackTrace();
			return null;
		}
          return null;
	}
    
    public void closeConnection() throws SQLException{
             myconn.close();
    }
    

    
}
