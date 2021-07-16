// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input


public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
     // System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
	Scanner sc=new Scanner(System.in);
	String firstName, itemOrder, frostingType, fillingType, toppings, input;
	double cost=15.00, tax;
	final double TAX_RATE=0.08;

	 
    // Introduce shop and prompt user to input first name
      System.out.println("Welcome to Java´s Cupcake Shop!");
      System.out.println("We make custom cakes with our secret cake batter!");

	  
	  
    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
      System.out.println("What is your first name?");
      firstName=sc.nextLine();
      System.out.println(firstName+", please see our MENU below: \n");
      
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU

	System.out.println("_____________________________________________");
	System.out.println("MENU	QUANTITY	BASE	COST ");
	System.out.println("_____________________________________________");
	System.out.println("Cake		1	15€");
	System.out.println("Set of Cupcakes	6		15€");
	System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
	System.out.println("Frostings (vanilla, chocolate, strawberry, coco)");
	System.out.println("Fillings (mocha, mint, lemon, caramel, raspberry)");
	System.out.println("Toppings (sprinkles, cinnamon, cocoa, nuts)");
	System.out.println("_____________________________________________");
	
    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER

	System.out.println("Do you want CUPCAKES or CAKE?");
	itemOrder=sc.nextLine();
	  
	  
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING

	System.out.println("What type of FROSTING do you want?");
	System.out.println("Vanilla, Chocolate, Strawberry or Coco");
	frostingType=sc.nextLine();
	 
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING

	System.out.println("What type of FILLING do you want?");
	System.out.println("Mocha, Mint, Lemon, Caramel or Raspberry");
	fillingType=sc.nextLine();  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS

	System.out.println("What type of TOPPING do you want?");
	System.out.println("Sprinkles, Cinnamon, Cocoa or Nuts");
	toppings=sc.nextLine();
	sc.close();
      
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION

	System.out.println("\n"+firstName+", your order is as follows: ");
	System.out.println("___________________________________________");
	System.out.println("Item ordered: "+itemOrder);
	System.out.println("Frosting: "+frostingType);
	System.out.println("Filling: "+fillingType);
	System.out.println("Topping: "+toppings);
	System.out.println("___________________________________________");
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
	System.out.printf("The cost of your order is: €%.2f\n", cost);
	tax=cost*TAX_RATE;
	System.out.printf("The tax is: €%.2f\n", tax);
	System.out.printf("The total due is: €%.2f\n", (tax+cost));
    }   
}