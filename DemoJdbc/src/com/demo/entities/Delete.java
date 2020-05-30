package com.demo.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.demo.utilities.PosgresUtilities;

public class Delete {
	public static void deleteStudentDetails()
	{
		/*String url = "jdbc:postgresql://localhost/studentRecord"; 
		String user = "postgres"; 
		String pass = "12345678";*/

		Connection con = null;
		try {
			//con = DriverManager.getConnection(url,user,pass);
			con = DriverManager.getConnection(PosgresUtilities.url,PosgresUtilities.user,PosgresUtilities.pass);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		String sql = "DELETE FROM student WHERE rollNo=?";
		 
		PreparedStatement statement = null;
		try {
			statement = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner k = new Scanner(System.in); 
		System.out.println("Enter The Roll No For Delete Table"); 
		int roll = k.nextInt();
		
		try {
			statement.setInt(1, roll);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		int rowsDeleted = 0;
		try {
			rowsDeleted = statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (rowsDeleted > 0) {
		    System.out.println("A user was deleted successfully!");
		}
	}
}
