package entities;

import java.util.Scanner;

import org.example.beans.Inventory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddProduct {
	public static void addProductDetails() {

		
		
		/*
		 * Configuration and SessionFactory is responsible for create the table
		 */
		
		Inventory st = new Inventory();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product Name"); 
        String name = sc.nextLine(); 
        System.out.println("Enter Product Type"); 
        String type =  sc.nextLine();
        System.out.println("Enter Product Quantity"); 
        int quantity= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Product Price"); 
        int price= sc.nextInt();
        sc.nextLine();

		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		st.setName(name);
        st.setType(type);
		st.setQuantity(quantity);
		st.setPrice(price);
		s.save(st);
		s.beginTransaction().commit();
	}
}