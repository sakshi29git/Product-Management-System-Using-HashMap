package Hashmap_pr;

import java.util.Scanner;

public class Product {
    int product_id, price, qty, avq,tcost,dis;
    String product_name, category;
    Scanner sc = new Scanner(System.in);

    Product() {
        System.out.println("Available products:");
        System.out.println("1. Jeans");
        System.out.println("2. Shirts");
        System.out.println("3. Tea-Shirts");
        System.out.println("4. Plazo");
        System.out.println("5. Watch");
        System.out.println("6. Shoes");
        System.out.println("7. Sandals");
        System.out.println("8. Goggles");
        System.out.println("Enter product details:");
        System.out.println("Enter name of product you wanted to buy:  ");
        product_name = sc.next();
        product_name = product_name.toUpperCase();
        switch (product_name) {
            case "JEANS":
                avq = 10;
                price=500;
                product_id=1;
                category="Cloths";
                break;
            case "SHIRTS":
                avq = 20;
                price=500;
                product_id=1;
                category="Cloths";
                
                break;
            case "TEA-SHIRTS":
                avq = 15;
                price=300;
                product_id=1;
                category="Cloths";
                break;
                
            case "PLAZO":
            	avq=8;
            	 price=400;
            	 product_id=1;
            	 category="Cloths";
            	break;
            	
            case "WATCH":
            	avq=10;
            	 price=1500;
            	 product_id=1;
            	 category="Acessories";
            	break;
            	
            case "SHOES":
            	avq=10;
            	 price=2000;
            	 product_id=1;
            	 category="Acessories";
            	break;
            	
            case "SANDALS":
            	avq=10;
            	 price=800;
            	 product_id=1;
            	 category="Acessories";
            	break;
            	
            case "GOGGLES":
            	avq=12;
            	 price=350;
            	 product_id=1;
            	 category="Acessories";
            	 break;
            
            	  
            	
            // Add cases for other products similarly
            default:
                System.out.println("Invalid product name");
                System.exit(1);
                break;
        }
        System.out.println("Available qty: " + avq);
        System.out.println("Enter qty: ");
        qty = sc.nextInt();
        if (qty > avq) {
            System.out.println("Out of stock");
            System.exit(1);
        } else if (qty == 0) {
            System.out.println("Invalid entry");
            System.exit(1);
        } else {
            avq -= qty; // Decrease available quantity by the quantity purchased
        }
        
        tcost=qty*price;
        if(tcost>2000)
        {
        	dis=(int) (price*0.10f);
        	tcost=tcost-dis;
        }
        else {
        	dis=0;
        	tcost=tcost-dis;
        	System.out.println("Discount is not applicable..Please do shopping upto 2000rs to get 10% discount.....");
        	return;
        }
    }
    
    
    void disp()
    {
    	System.out.println("Product name: " + product_name);
    	System.out.println("Category: " + category);
    	System.out.println("Product id: " + product_id);
    	System.out.println("Product qty: " +qty );
    	System.out.println("Left qty: " + avq);
    	System.out.println("Price: " + price + " and discount: " + dis);
    	System.out.println("Final amount to be paid: " + tcost);
    }

}
