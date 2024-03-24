package Hashmap_pr;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Product_menu {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 LinkedHashMap<Integer, Product> sortedMap = new LinkedHashMap<>();
	int choice;
	HashMap<Integer,Product> obj=new HashMap<>();
	Product_operation op=new Product_operation();
	
	do {
		System.out.println("1. Product in shop");
		System.out.println("2. Add product into cart");
		System.out.println("3. Check cart");
		System.out.println("4. check how many products in cart");
		System.out.println("5. Search Product");
		System.out.println("6. Remove Product");
		System.out.println("7. Buy Product");
		System.out.println("8. Exit");
		System.out.print("Enter your choice: ");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			op.product();
			break;
			
			
		case 2:
		    System.out.print("Enter the number of products to add: ");
		    int numProducts = sc.nextInt();
		    for (int i = 0; i < numProducts; i++) {
		        obj = op.add_det();
		    }
		    break;
		case 3:
			op.cart_product(obj);
			break;
			
			
		case 4:
			op.isempty(obj);
			break;
			
		case 5:
			op.search(obj);
			break;
			
		case 6:
			op.remove_Cart(obj);
			break;
			
		case 7:
			op.buy_product(obj);
			break;
			
		
			
		case 8:
			System.out.println("Exit");
			break;
			
		default:
			System.out.println("Wrong choice");
			break;
			
		}
	}while(choice!=8);
}
}
