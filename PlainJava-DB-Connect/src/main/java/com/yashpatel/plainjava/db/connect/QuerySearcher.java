/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yashpatel.plainjava.db.connect;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Yash Patel
 */
public class QuerySearcher extends Main {
    private static DBConnector dBConnector = new DBConnector();
    static PreparedStatement mystat = null;
    Connection connection = dBConnector.makeJDBCConnection();
    public ArrayList<Todo> searchQuery(String query){
        ArrayList<Todo> resultList = new ArrayList<Todo>();
        try {   
			mystat = connection.prepareStatement(query);
 
			// Execute the Query, and get a java ResultSet
			ResultSet rs = mystat.executeQuery();
                        
                        
			// Let's iterate through the java ResultSet
			while (rs.next()) {
                                // 
                                Todo currtodo = new Todo();
                                currtodo.setTitle(rs.getString("title"));
                                currtodo.setDescription(rs.getString("description"));
                                currtodo.setStatus(0);
                                currtodo.setId(rs.getInt("id"));
                                resultList.add(currtodo);
                                
                                
                                
                                // log to the console
				Integer id = rs.getInt("id");
				String title = rs.getString("title");
				String description = rs.getString("description");
				Integer status= rs.getInt("status"); 
				// Simply Print the results
				System.out.format("%d, %s, %s, %d\n", id, title, description, status);
			}
                        
                        super.setResultText(resultList);
                        // not really advisable
                        mystat.close();
                        //dBConnector.closeConnection();
 
		} catch (
 
		SQLException e) {
			e.printStackTrace();
		}
        
        return resultList;
        
    }
    
    
    public Boolean updateQuery(String query){
        
    		try {
                        
			String insertQueryStatement = query;
 
			mystat = connection.prepareStatement(insertQueryStatement);
			// execute insert SQL statement
			mystat.executeUpdate();
                        return true;
		} catch (
 
		SQLException e) {
			e.printStackTrace();
		}
                return false;
    }
    
    
    public void geById(){
    
    }
    
    public void getByTaskName(){
    
    }
    
    public void getCompleted(){
    
    }
    
    public void getUncompleted(){
    
    }
    
    
}
