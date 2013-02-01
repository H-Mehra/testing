package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;


public class JDBCTest {
        @Test
        public void testDBConnection() throws ClassNotFoundException, SQLException{
        	Class.forName("com.mysql.jdbc.Driver");
        	Connection conn= DriverManager.getConnection("jdbc:mysql://173.200.182.212:3306/q1a_test","test","vipassana");
        	Statement stmt=conn.createStatement();
        	ResultSet rs=stmt.executeQuery("Select first_name, last_name from users");
        	while (rs.next()!=false) {
        		System.out.println(rs.getString("first_name"));        		
        	}
        }
        
    
}
