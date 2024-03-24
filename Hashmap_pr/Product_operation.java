package Hashmap_pr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Product_operation {
	int cart;
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,Product> obj=new HashMap<>();
	
	HashMap<Integer, Product> add_det() {
	    Product op = new Product();
	    obj.put(op.product_id, op);
	    return obj;
	}


		
	

	void cart_product(HashMap<Integer,Product> obj)
	{
		for(Map.Entry<Integer, Product> hm:obj.entrySet())
		{
			hm.getValue().disp();
		}
		cart=obj.size();
		System.out.println("Total product in cart: " +cart);
				
	}
	
	
	void search(HashMap<Integer,Product> obj)
	{
		String name;
		System.out.println("Enter product name: ");
		name=sc.next();
		name=name.toUpperCase();
		boolean found=false;
		for(Map.Entry<Integer, Product> hm:obj.entrySet())
		{
			if(hm.getValue().product_name.equals(name))
			{
				hm.getValue().disp();
				found=true;
			}
			
	
		}
		if(!found)
		{
			System.out.println("Product is missing...");
		}
	}
	


	 void product()
	 {
		 System.out.println("Available products:");
	        System.out.println("1. Jeans");
	        System.out.println("2. Shirts");
	        System.out.println("3. Tea-Shirts");
	        System.out.println("4. Plazo");
	        System.out.println("5. Watch");
	        System.out.println("6. Shoes");
	        System.out.println("7. Sandals");
	        System.out.println("8. Goggles");
	 }
	 
	 void remove_Cart(HashMap<Integer,Product> obj)
	 {
		 String name;
		 System.out.println("Enter product name: ");
		 name=sc.next();
		 name=name.toUpperCase();
		 Iterator<Map.Entry<Integer, Product>> iterator=obj.entrySet().iterator();
		 while(iterator.hasNext())
		 {
			 Map.Entry<Integer, Product> entry = iterator.next();
		        if (entry.getValue().product_name.equals(name)) {
		            iterator.remove(); // Use iterator to safely remove the entry
		            
		        }
		 }
		 System.out.println("Product removed sucessfully");
	 	}
	 
	 void isempty(HashMap<Integer,Product> obj)
	 {
		 if(obj.isEmpty())

		 {
			 System.out.println("Sorry cart is empty.....");
		}
		 
		 else {
			 System.out.println("Cart is not empty, total products in cart:" + obj.size());
		 }
		 
		 
	 }
	 
	 void buy_product(HashMap<Integer, Product> obj) {
		    String name, upi;
		    int choice;

		    if (obj.isEmpty()) {
		        System.out.println("Sorry, the cart is empty.");
		        System.exit(1); // Return instead of exiting the program
		    }

		    System.out.println("Enter product name: ");
		    name = sc.next().toUpperCase();
		    
		    boolean productFound = false;
		    Iterator<Map.Entry<Integer, Product>> iterator = obj.entrySet().iterator();
		    while (iterator.hasNext()) {
		        Map.Entry<Integer, Product> entry = iterator.next();
		        if (entry.getValue().product_name.equals(name)) {
		            entry.getValue().disp();
		            iterator.remove(); // Use iterator to safely remove the entry
		            productFound = true;
		            System.out.println("Product found successfully.");
		            break;
		        }
		    }
		    
		    if (!productFound) {
		        System.out.println("Product not found in the cart.");
		        return; // Return if the product is not found
		    }

		    System.out.println("Enter your choice:");
		    System.out.println("1: Online payment");
		    System.out.println("2: Cash on delivery");
		    choice = sc.nextInt();

		    switch (choice) {
		        case 1:
		            System.out.println("Enter your UPI: ");
		            upi = sc.next();
		            System.out.println("Your order placed successfully");
		            break;
		        case 2:
		            System.out.println("Please pay after delivery.");
		            System.out.println("Your order placed successfully");
		            break;
		        default:
		            System.out.println("Wrong choice");
		            break;
		    }
		}

	 	} 
	 
	 

