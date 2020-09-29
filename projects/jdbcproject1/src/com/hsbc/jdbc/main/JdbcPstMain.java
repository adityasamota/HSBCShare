package com.hsbc.jdbc.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class JdbcPstMain {

	public static void main(String[] args) {

		try {
			Connection con = DriverManager.getConnection("jdbc:derby:e:/derbydb/trgdb");

			System.out.println("Connection successfully created");

			con.setAutoCommit(false);
			String st = "insert into emp values(?,?,?,?)";

			PreparedStatement pst = con.prepareStatement(st);

			String nm = "Sudhir";

			Date d1 = Date.valueOf("1999-10-10");

			LocalDate ld = LocalDate.of(1999, 10, 10);

			Date d2 = Date.valueOf(ld);

			pst.setInt(1, 900);
			pst.setString(2, nm);
			pst.setFloat(3, 8888);
			pst.setDate(4, d1);

			pst.executeUpdate();

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from emp");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "   " + rs.getFloat(3));
			}

			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}