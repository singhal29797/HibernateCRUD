package org.example.MavenTest;

import java.util.Scanner;

import entities.AddProduct;
import entities.DeleteInventory;
import entities.UpdateInventory;
import entities.ViewAllInventory;
import entities.ViewInventory;

public class InventoryApp
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int ch=0;
		while(ch != 6)
		{
			System.out.println("Enter the Choice");
			System.out.println("1.Add Product\n2.View Product\n3.View All Product List\n4.Update Product List\n5.Remove Perticular Product");
			ch = sc.nextInt();
			switch (ch) 
			{
        		case 1:
        			AddProduct.addProductDetails();
        			break;
        		case 2:
        			ViewInventory.viewInventoryDetails();
        			break;
        		case 3:
        			ViewAllInventory.viewAllInventoryDetails();
        			break;
        		case 4:
        			UpdateInventory.updateInventoryDetails();
        			break;
        		default:
        			DeleteInventory.deleteInventoryDetails();
        			break;
			}
		}
	}
}	