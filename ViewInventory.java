package entities;
import java.util.List;
import java.util.Scanner;

import org.example.beans.Inventory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class ViewInventory
{
	public static void viewInventoryDetails() 
	{
		
		
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		/*
		 * Configuration and SessionFactory is responsible for create the table
		 */

		Session s = sf.openSession();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Product Id For Inventory View"); 
        int id= sc.nextInt();
		
		Criteria criteria = s.createCriteria(Inventory.class);
		//Criteria fixed for showing all the product list using loop
		@SuppressWarnings("unchecked")
		List<Inventory> list=criteria.list();
        
        for(Inventory stu:list)
        {
        	if(id==stu.getId())
        	{
        	System.out.println("=========================================================================");
        	System.out.println(stu.getId()+"  |  "+stu.getName()+"  |  "+stu.getType()+"  |  "+stu.getQuantity()+"  |  "+stu.getPrice());
        	}
        }
        System.out.println("=========================================================================");
		s.beginTransaction().commit();
	}
}