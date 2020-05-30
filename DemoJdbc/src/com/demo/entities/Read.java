package com.demo.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.demo.utilities.PosgresUtilities;

public class Read {

	public static void readStudentDetails()
	{
		Statement statement=null;
		
        //Creating the connection 
        /*String url = "jdbc:postgresql://localhost/studentRecord"; 
        String user = "postgres"; 
        String pass = "12345678";*/
		
		Scanner k = new Scanner(System.in); 
		System.out.println("Enter The Roll No For Update Table"); 
		String roll2 = k.nextLine(); 

		String sql = "SELECT * FROM student";
		Connection con=null;
		try {
			//con = DriverManager.getConnection(url,user,pass);
			con = DriverManager.getConnection(PosgresUtilities.url,PosgresUtilities.user,PosgresUtilities.pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			statement = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet result=null;
		try {
			result = statement.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try {
			System.out.println("===============================================================");
			while (result.next())
			{
				if(roll2.equals(result.getString("rollno")))
				{
				String name = result.getString("name");
				String roll= result.getString("rollno");
				String cls = result.getString("cls");
				System.out.println(name+"       "+roll+"       "+cls);
				System.out.println("===============================================================");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
