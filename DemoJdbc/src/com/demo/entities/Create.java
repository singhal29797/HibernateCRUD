package com.demo.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import com.demo.utilities.PosgresUtilities;

public class Create {
	public static void createStudentDetails()
	{
        Scanner k = new Scanner(System.in); 
        System.out.println("enter name"); 
        String name = k.nextLine(); 
        System.out.println("enter roll no"); 
        int roll = k.nextInt(); 
        System.out.println("enter class"); 
        String cls =  k.next();
        
        //Creating the connection 
      /*  String url = "jdbc:postgresql://localhost/studentRecord"; 
        String user = "postgres"; 
        String pass = "12345678";*/
  
              
        //Inserting data using SQL query 
        String sql = "insert into student (name, rollNo, cls) values('"+name+"',"+roll+",'"+cls+"')"; 
        Connection con=null; 
        try
        { 

  
           //Reference to connection interface 
            con = DriverManager.getConnection(PosgresUtilities.url,PosgresUtilities.user,PosgresUtilities.pass); 
  
            Statement st = con.createStatement(); 
            int m = st.executeUpdate(sql); 
            if (m == 1) 
                System.out.println("inserted successfully : '"+name+"',"+roll+",'"+cls+"'"); 
            else
                System.out.println("insertion failed"); 
            con.close(); 
        } 
        catch(Exception ex) 
        { 
            System.err.println(ex); 
        } 
    }  
	

}
