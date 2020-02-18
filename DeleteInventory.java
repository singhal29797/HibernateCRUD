package entities;
import java.util.Scanner;

import org.example.beans.Inventory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DeleteInventory
{
	public static void deleteInventoryDetails() 
	{
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		/*
		 * Configuration and SessionFactory is responsible for create the table
		 */
		Session s = sf.openSession();
		Inventory st = new Inventory();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Product Id For Delete Product Inventory "); 
        int id= sc.nextInt();


		st.setId(id);
		s.delete(st);
		s.beginTransaction().commit();
	}
}