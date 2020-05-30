package com.demo.app;

import java.util.Scanner;

import com.demo.entities.Create;
import com.demo.entities.Delete;
import com.demo.entities.Read;
import com.demo.entities.ReadAll;
import com.demo.entities.Update;
public class StudentApp 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int ch=1;
	while(ch != 6)
	{
		System.out.println();
		System.out.println("Enter the Choice");
		System.out.println("1.Create\n2.Retrieve\n3.RetrieveAll\n4.Update\n5.Delete");
		ch = sc.nextInt();
        switch (ch) 
        {
        	case 1:
        		Create.createStudentDetails();
        		break;
        	case 2:
        		Read.readStudentDetails();
        		break;
        	case 3:
        		ReadAll.readAllStudentDetails();
        		break;
        	case 4:
        		Update.updateStudentDetails();
        		break;
        	default:
        		Delete.deleteStudentDetails();
        		break;
        }
	}
	}

}