package com.demo.database.mysql.implementations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.demo.entities.StudentEntity;
import com.demo.utilities.PosgresUtilities;

public class MySQLStudent extends MySQLBaseDataAccessLayer
{
	
	public void CreateStu(StudentEntity studentEntity)
	{
		super.create(studentEntity);
	}
	/* public static void createStudentDetails()
	  {
        Scanner k = new Scanner(System.in); 
        System.out.println("enter name"); 
        String name = k.nextLine(); 
        System.out.println("enter roll no"); 
        int roll = k.nextInt(); 
        System.out.println("enter class"); 
        String cls =  k.next();

              
        //Inserting data using SQL query 
        
        Connection con=null; 
        try  { 

        	//PosgresUtilities a1 = new PosgresUtilities();
           //Reference to connection interface 
            a1.con = DriverManager.getConnection(url,user,pass); 
  
            Statement st = con.createStatement(); 
            int m = st.executeUpdate(sql); 
            if (m == 1) 
                System.out.println("inserted successfully : '"+name+"',"+roll+",'"+cls+"'"); 
            else
                System.out.println("insertio4n failed"); 
            con.close(); 
        } 
        catch(Exception ex) 
        { 
            System.err.println(ex); 
        } 
    }  
	*/
	
}
