package Second;


import java.util.ArrayList;
import java.util.Scanner;

public class PizzaChoice
{
	private static ArrayList<PizzaBase> bases = new ArrayList<PizzaBase>();		
	private static ArrayList<PizzaTopping> tops = new ArrayList<PizzaTopping>();	
	private static Scanner keyboard;	
	
	private static int bInput;							
	private static int tInput;							
	
	public static void addBase(PizzaBase base)					
	{
		bases.add(base);
	}
	
	public static void addTop(PizzaTopping topping)					
	{
		tops.add(topping);
	}
		
	public static void main(String[] args) 						
	{
		
		Pizza pizza = new Pizza();						
		
		addBase(new PizzaTopping("Thin",150,false));
		addBase(new PizzaTopping("Thick",200,false));
		addBase(new PizzaTopping("Stuffed crust", 250,false));
		
		baseMenu(pizza);							
		
		try
		{
		baseChoice(pizza);							
		}		
      catch(IllegalArgumentException iae)						
		{
      		System.out.println("Invalid selection, please select again");	
      		baseChoice(pizza);						
		}
		
		
		addTop(new PizzaTopping("Extra Cheese", 35, false));
		
		addTop(new PizzaTopping("Tomato Sauce",10, false));
		addTop(new PizzaTopping("BBQ Sauce", 10, false));		
				
		addTop(new PizzaTopping("Chicken Tikka", 35, true));
		addTop(new PizzaTopping("Barbeque chiken", 40, true));
		addTop(new PizzaTopping("Grilled Chiken", 40, true));
		
		addTop(new PizzaTopping("Pepperoni", 45, true));
		addTop(new PizzaTopping("Bacon", 50, true));		
		
		
		addTop(new PizzaTopping("Black olive", 20, false));
		addTop(new PizzaTopping("Mushrooms", 30, false));
		addTop(new PizzaTopping("Capsicum", 25, false));
		
		addTop(new PizzaTopping("Paneer", 30, false));		
		addTop(new PizzaTopping("Sweetcorn", 25, false));
		
		toppingMenu(pizza);	
		try
		{
		toppingChoice(pizza);							
		}
      catch(IllegalArgumentException iae)						
		{		
      		System.out.println("Invalid selection, please select again");	
      		toppingChoice(pizza);						
		}
		pizza.total();								
	}
	
	public static void baseMenu(Pizza pizza)					
	{
		int i = 1;								
		keyboard = new Scanner(System.in);					
		
		System.out.println("Pizza base selection");											
		String newLine = System.getProperty("line.separator");			

		System.out.print("\t------------------------------------" + newLine);	
		System.out.format("\t%15s%21s", "-Bases-",  "-Price- "+ newLine);	
		System.out.print("\t------------------------------------" + newLine);
			
		
		for(PizzaBase base : bases)									
		{
			System.out.printf(newLine + "\t%5s. %-15s:%10s", i, base.getName(), base.getCost());	
			i++;											
		}
		
		System.out.print(newLine + "\t------------------------------------" + newLine);			
	}
	
	public static void baseChoice(Pizza pizza)								
	{	
		System.out.println("Please enter your choice of base by entering its respective number.");
		bInput = keyboard.nextInt();
						
			if(bInput<1||bInput>3)										
			{
				throw new IllegalArgumentException("\nMust enter a number between 1 and 3.\nPlease run again.");	
			}
			else if(bInput == 1)									
			{
				pizza.setPizzaBase(new PizzaTopping("Thin", 150, false));			
				System.out.println("You've selected 'Thin'.\n");
			}
			else if(bInput == 2)
			{
				pizza.setPizzaBase(new PizzaTopping("Thick", 200, false));				
				System.out.println("You've selected 'Thick'.\n");					
			}
			else if(bInput == 3)
			{
				pizza.setPizzaBase(new PizzaTopping("Stuffed", 250, false));			
				System.out.println("You've selected 'Stuffed crust'.\n");				
			}
			pizza.setbInput(bInput);
			
		}
		
		
	
	public static void toppingMenu(Pizza pizza)								
	{
		int i = 1;											
		
		System.out.println("Pizza topping selection");
		String newLine = System.getProperty("line.separator");						
		System.out.print("\t------------------------------------" + newLine);				
		System.out.format("\t%15s%10s", "-Toppings-",  "-Price- "+ newLine);			
		System.out.print("\t------------------------------------" + newLine);				
		
		for(PizzaTopping topping : tops)								
		{
			System.out.printf(newLine + "\t%5s. %-15s:%10s", i, topping.getName(), topping.getCost());	
			i++;											
		}
		
		System.out.print(newLine + "\t------------------------------------" + newLine);			
	}
	
	public static void toppingChoice(Pizza pizza)								
	{	
		System.out.println("Please select your toppings by entering their respective numbers."		
					+ "\nEnter 0 at any time to end the selection.\n");	
		do												
		{
			tInput = keyboard.nextInt();							
			pizza.settInput(tInput);
		if(tInput<-1||tInput>13)									
		{
			throw new IllegalArgumentException("\nMust enter a number between 0 and 13.\nPlease run again.");
		}	
		else if(tInput == 0)										
		{
			System.out.println("End of topping selection.");				
			break;
		}
		else if(tInput == 2)										
		{
			pizza.addTopping(new PizzaTopping("Tomato Sauce", 10, false));			
			System.out.println("You've selected 'Tomato Sauce'.");					
		}
		else if(tInput == 3)
		{
			pizza.addTopping(new PizzaTopping("BBQ", 10, false));
			System.out.println("You've selected 'BBQ Sauce'.");
		}
		else if(tInput == 1)
		{
			pizza.addTopping(new PizzaTopping("Extra Cheese", 35, false));
			System.out.println("You've selected 'Extra Cheese'.");
		}
		else if(tInput == 6)
		{
			pizza.addTopping(new PizzaTopping("Grilled Chiken", 40, true));
			System.out.println("You've selected 'Grilled Chiken'.");
		}
		else if(tInput == 7)
		{
			pizza.addTopping(new PizzaTopping("Pepperoni", 45, true));
			System.out.println("You've selected 'Pepperoni'.");
		}
		else if(tInput == 8)
		{
			pizza.addTopping(new PizzaTopping("Bacon", 50, true));
			System.out.println("You've selected 'Bacon'.");
		}
		else if(tInput == 4)
		{
			pizza.addTopping(new PizzaTopping("Chicken Tikka", 35, true));
			System.out.println("You've selected 'Chicken Tikka'.");
		}
		else if(tInput == 5)
		{
			pizza.addTopping(new PizzaTopping("Barbeque chiken", 45, true));
			System.out.println("You've selected 'Barbeque chiken'.");
		}
		else if(tInput == 10)
		{
			pizza.addTopping(new PizzaTopping("Mushrooms", 30, false));
			System.out.println("You've selected 'Mushrooms'.");
		}
		else if(tInput == 11)
		{
			pizza.addTopping(new PizzaTopping("Capsicum", 25, false));
			System.out.println("You've selected 'Capsicum'.");
		}
		else if(tInput == 12)
		{
			pizza.addTopping(new PizzaTopping("Paneer", 30, false));
			System.out.println("You've selected 'Paneer'.");
		}
		else if(tInput == 9)
		{
			pizza.addTopping(new PizzaTopping("Black olive", 20, false));
			System.out.println("You've selected 'Black olive'.");
		}
		else if(tInput == 13)
		{
			pizza.addTopping(new PizzaTopping("Sweetcorn", 25, false));
			System.out.println("You've selected 'Sweetcorn'.");
		}
		} while(tInput != 0);	
	}
	
}

