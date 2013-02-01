package com.q1a.jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestJDBCConnection {

	private static PreparedStatement pStmt;
	private static PreparedStatement pStmt1;
	private static Statement stmt;
	private static Connection conn;
	private static ResultSet rs;

	@BeforeClass
	public static void setUp() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(
				"jdbc:mysql://173.200.182.212:3306/q1a_test", "test",
				"vipassana");
		stmt = conn.createStatement();
		pStmt = conn
				.prepareStatement("select userid,first_name,last_name,email_address from users where userid=?");
		pStmt1 = conn
		.prepareStatement("select userid,first_name,last_name,email_address from users where userid=? and is_active=?");

	}

	@Ignore
	@Test
	public void testSelect() throws SQLException {

		String sql = "select first_name,last_name,email_address from users";
		rs = stmt.executeQuery(sql);

		while (rs.next()) {
			System.out.println("*************************");
			System.out.println(rs.getString("userid") + " ");
			System.out.print(rs.getString("first_name") + " ");
			System.out.print(rs.getString("last_name") + " ");
			System.out.print(rs.getString("email_address") + " ");
			System.out.println("**************** ");
		}

	}

	@Test
	public void testSelectWithWhereClause() throws SQLException {

		String sql = "select userid,first_name,last_name,email_address from users where userid=45 ";
		rs = stmt.executeQuery(sql);

		while (rs.next()) {
			System.out.print(rs.getString("first_name") + " ");
			System.out.print(rs.getString("last_name") + " ");
			System.out.print(rs.getString("email_address") + " ");
			System.out.println(" ");
		}

	}

	@Test
	public void testSelectWithPreparedStatement() {
		try {
			pStmt.setInt(1, 45);
			rs=pStmt.executeQuery();

			while (rs.next()) {
				System.out.println("*************************");
				System.out.println(rs.getString("userid") + " ");
				System.out.print(rs.getString("first_name") + " ");
				System.out.print(rs.getString("last_name") + " ");
				System.out.print(rs.getString("email_address") + " ");
				System.out.println("**************** ");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Test
	public void testSelectWithPreparedStatementWith2BindVariable() {
		try {
			pStmt1.setInt(1, 45);
			pStmt1.setInt(2, 1);
			rs=pStmt1.executeQuery();

			while (rs.next()) {
				System.out.println("*************************");
				System.out.println(rs.getString("userid") + " ");
				System.out.print(rs.getString("first_name") + " ");
				System.out.print(rs.getString("last_name") + " ");
				System.out.print(rs.getString("email_address") + " ");
				System.out.println("**************** ");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterClass
	public static void tearDown() throws SQLException {

		stmt.close();
		rs.close();
		conn.close();

	}
}
