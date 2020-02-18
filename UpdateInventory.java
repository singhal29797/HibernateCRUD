package entities;
import java.util.Scanner;
import org.example.beans.Inventory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateInventory
{
	public static void updateInventoryDetails() 
	{
		
		/*
		 * Configuration and SessionFactory is responsible for create the table
		 */
		
		Inventory st = new Inventory();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the ID for Update the Product Details"); 
	    //@SuppressWarnings("unused")
		int id= sc.nextInt();
        System.out.println("Enter Updated Product Name"); 
        String name = sc.next();
        sc.nextLine();
        System.out.println("Enter Updated Product Type"); 
        String type =  sc.nextLine();
        System.out.println("Enter Updated Product Quantity"); 
        int quantity= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Updated Product Price"); 
        int price= sc.nextInt();
        sc.nextLine();
        //updated all the Inventory product list by using porimry key (id).

		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		st.setId(id);
		st.setName(name);
        st.setType(type);
		st.setQuantity(quantity);
		st.setPrice(price);
		s.update(st);
		s.beginTransaction().commit();
	}
}