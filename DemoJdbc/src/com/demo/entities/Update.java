package com.demo.entities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.demo.utilities.PosgresUtilities;

public class Update {
	public static void updateStudentDetails()
	{
		/*String url = "jdbc:postgresql://localhost/studentRecord"; 
		String user = "postgres"; 
		String pass = "12345678";*/

		Connection con = null;
		String sql = "UPDATE student SET name=?,cls=? WHERE rollNo=?";
		try {
			//con = DriverManager.getConnection(url,user,pass);
			con = DriverManager.getConnection(PosgresUtilities.url,PosgresUtilities.user,PosgresUtilities.pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PreparedStatement statement=null;
		try {
			statement = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
	
		Scanner k = new Scanner(System.in); 
		System.out.println("Enter The Roll No For Update Table"); 
		int roll = k.nextInt(); 
		System.out.println("Enter Updated Name"); 
		String name = k.next(); 
		k.nextLine();
		System.out.println("Enter Updated Class"); 
		String cls =  k.next();
		System.out.println();
		System.out.println("Updated Name is : "+name);
		System.out.println("Updated Class is : "+cls);
    
		try {
			statement.setString(1, name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			statement.setInt(3, roll);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			statement.setString(2, cls);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	 
		int rowsUpdated = 0;
		try {
			rowsUpdated = statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (rowsUpdated > 0) 
		{
			System.out.println("An existing user was updated successfully!");
		}
	}

}
