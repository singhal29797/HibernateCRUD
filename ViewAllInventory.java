package entities;
import java.util.List;

import org.example.beans.Inventory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class ViewAllInventory
{
	public static void viewAllInventoryDetails() 
	{
		
		
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		/*
		 * Configuration and SessionFactory is responsible for create the table
		 */

		Session s = sf.openSession();
		
		Criteria criteria = s.createCriteria(Inventory.class);

		@SuppressWarnings("unchecked")
		List<Inventory> list=criteria.list();
		
		 //Criteria fixed for showing all the product list using loop
		 


		for(Inventory stu:list)
		{
			System.out.println("===============================================================");
			System.out.println(stu.getId()+"  |  "+stu.getName()+"  |  "+stu.getType()+"  |  "+stu.getQuantity()+"  |  "+stu.getPrice());
		}
		System.out.println("===============================================================");
		
		/**
		 * Transaction Code commit 
		 */

		s.beginTransaction().commit();
	}
}
