package Second;



import java.util.Scanner;

public class PizzaMenu
{
	private static int pIn;	
	private static int ch;
	private static int vg;
	private static Scanner keyboard;			
	
	public static void main(String[] args) 			
	{
		Pizza pizza = new Pizza();			
		menu(pizza);					
		try						
		{
			choice(pizza);
			
		}
      catch(IllegalArgumentException iae)			
		{
      		System.out.println("Invalid selection, please select again");	
      		choice(pizza);
      									
		}
		pizza.total();					
	}
	
	public static void menu(Pizza pizza)		
	{
		keyboard = new Scanner(System.in);	
		
		System.out.println("Pizza selection");
		String newLine = System.getProperty("line.separator");					
		System.out.print("\t-------------------------" + newLine);		
		System.out.format("\t%20s", "-Chatagory of Pizza- "+ newLine);		
		System.out.print("\t-------------------------" + newLine);
		
		System.out.format("\t%-5s%10s\t\t", "1.", "Vegeterian Pizza" + newLine);
		System.out.format("\t%-5s%1s\t\t",  "2.","Non-Vegeterian Pizza"+ newLine);		
		
	
		System.out.print(newLine + "\t-------------------------" + newLine);	
	}
	
	public static void choice(Pizza pizza) {
		System.out.println("Select Your Chatagory : ");
		ch = keyboard.nextInt();	
		
		if(ch<1||ch>6)
		{
			throw new IllegalArgumentException("\nMust enter a number between 1 and 6.\nPlease run again.");
		}
		else if(ch==1)
		{
			System.out.println("------------------------------");
			System.out.println("You Selected Vegeterian Pizza.");
			System.out.println("Select Your Pizza");
			String newLine = System.getProperty("line.separator");					
			System.out.print("\t-------------------------------------------------------------" + newLine);		
			System.out.format("\t%15s%40s", "-Pizzas-",  "-Description- "+ newLine);		
			System.out.print("\t-------------------------------------------------------------" + newLine);
			
			System.out.format("\t%-5s%1s\t\t%10s", "1.", "Deluxe Veggie", "Cheese , mushrooms, pineapple" + newLine);
			System.out.format("\t%-5s%1s\t\t%30s", "2.", "Cheese and Corn", "Cheese,Sweet Corn and pineapple" + newLine);			
			System.out.format("\t%-5s%1s\t\t%30s", "3.", "Paneer Tikka", "paneer, cheese, mushrooms" + newLine);
			System.out.format("\t%-5s%1s\t\t%40s", "4.", "Mexican", "cheese, peppers and pineapple" + newLine);
			System.out.format("\t%-5s%1s\t\t%35s", "5.", "Veggie", "Peppers, mushrooms, onions and sweetcorn" + newLine);
			System.out.format("\t%-5s%1s\t\t%35s", "6.", "Margherita", "Cheese and tomato" + newLine);	
		
			System.out.print(newLine + "\t-------------------------------------------------------------" + newLine);
			
			System.out.println("Please enter your pizza by entering its respective number.");
			pIn = keyboard.nextInt();
			
			if(pIn<1||pIn>6)									
			{
				throw new IllegalArgumentException("\nMust enter a number between 1 and 5.\nPlease run again.");	
			}
			else if(pIn==1)
			{
				deluxeVeggie(pizza);
				System.out.println("You've selected 'Deluxe Veggie Regular'.\n");
			}
			else if(pIn == 2)
			{
				cheeseAndCorn(pizza);																													
				System.out.println("You've selected 'Cheese and Corn'.\n");			
			}
			else if(pIn == 3)
			{
				paneerTikka(pizza);								
				System.out.println("You've selected 'Paneer Tikka'.\n");				
			}
			else if(pIn == 4)
			{
				mexican(pizza);								
				System.out.println("You've selected 'Mexican'.\n");				
			}
			else if(pIn == 5)
			{
				veggie(pizza);																
				System.out.println("You've selected 'Veggie'.\n");			
			}
			else if(pIn == 6)									
			{
				margherita(pizza);								
				System.out.println("You've selected 'Margherita'.\n");			
			}
			
			pizza.setpIn(pIn);
			
		}
		else if(ch==2) 
		{	
			System.out.println("------------------------------");
			System.out.println("You Selected Non-Vegeterian Pizza.");
			System.out.println("Select Your Pizza");
			String newLine = System.getProperty("line.separator");					
			System.out.print("\t-------------------------------------------------------------" + newLine);		
			System.out.format("\t%15s%40s", "-Pizzas-",  "-Description- "+ newLine);		
			System.out.print("\t-------------------------------------------------------------" + newLine);
			
			System.out.format("\t%-5s%1s\t\t%10s", "1.", "Chicken Tikka", "Grilled Chiken , BBQ Sauce, Onions" + newLine);
			System.out.format("\t%-5s%1s\t\t%10s", "2.", "Pepper Barbecue Chicken", "Barbecue Chicken,Bacon, Cheese and Onions" + newLine);			
			System.out.format("\t%-5s%1s\t\t%30s", "3.", "Non Veg Supreme", "Bacon, Pepperoni, cheese, Barbecue Chicken" + newLine);
			System.out.format("\t%-5s%1s\t\t%40s", "4.", "Chicken Pepperoni", "Pepperoni, peppers, cheese, Bacon and Onions" + newLine);
			System.out.format("\t%-5s%1s\t\t%35s", "5.", "Indi Chicken Tikka", "Chicken Tikka, Cheese, Pepperoni, Black Olive" + newLine);
			System.out.format("\t%-5s%1s\t\t%35s", "6.", "Chicken Dominator", "Grilled Chicken, Barbecue Chicken, Cheese, Black Olive, Onions" + newLine);	
		
			System.out.print(newLine + "\t-----------------------------------------" + newLine);
			
			System.out.println("Please enter your pizza by entering its respective number.");
			pIn = keyboard.nextInt();
			
			if(pIn<1||pIn>6)									
			{
				throw new IllegalArgumentException("\nMust enter a number between 1 and 5.\nPlease run again.");	
			}
			else if(pIn==1)
			{
				chickenTikka(pizza);
				System.out.println("You've selected 'Chicken Tikka'.\n");
			}
			else if(pIn == 2)
			{
				pepperBarbecueChicken(pizza);																													
				System.out.println("You've selected 'Pepper Barbecue Chicken'.\n");			
			}
			else if(pIn == 3)
			{
				nonVegSupreme(pizza);								
				System.out.println("You've selected 'Non Veg Supreme'.\n");				
			}
			else if(pIn == 4)
			{
				chickenPepperoni(pizza);								
				System.out.println("You've selected 'Chicken Pepperoni'.\n");				
			}
			else if(pIn == 5)
			{
				pepperBarbecueChicken(pizza);																
				System.out.println("You've selected 'Pepper Barbecue Chicken'.\n");			
			}
			
			else if(pIn == 6)									
			{
				chickenDominator(pizza);								
				System.out.println("You've selected 'Chicken Dominator'.\n");			
			}
			pizza.setpIn(pIn);
		}
	}
	
	public static void deluxeVeggie(Pizza pizza) {
		pizza.setPizzaBase(new PizzaTopping("thin", 150, false));
		pizza.addTopping(new PizzaTopping("Mushrooms", 30, false));
		pizza.addTopping(new PizzaTopping("Cheese",35, false));	
		pizza.addTopping(new PizzaTopping("Pineapple",25, false));	
	}
	
	public static void cheeseAndCorn(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("thin", 150, false));			
		pizza.addTopping(new PizzaTopping("Tomato Sauce",10, false));			
		pizza.addTopping(new PizzaTopping("Cheese",35, false));				
		pizza.addTopping(new PizzaTopping("Peppers",20, true));				
		pizza.addTopping(new PizzaTopping("Pineapple",25, false));		
	}	
	
	public static void paneerTikka(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("Stuffed crust", 250, false));		
		pizza.addTopping(new PizzaTopping("BBQ Sauce",10, false));			
		pizza.addTopping(new PizzaTopping("Cheese",35, false));				
		pizza.addTopping(new PizzaTopping("Paneer",35, true));			
		pizza.addTopping(new PizzaTopping("Mushrooms",30, true));			
		pizza.addTopping(new PizzaTopping("Onion",20, false));			
		
	}
	
	public static void mexican(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("thick", 200, false));			
		pizza.addTopping(new PizzaTopping("BBQ Sauce",10, false));			
		pizza.addTopping(new PizzaTopping("Cheese",35, false));				
		pizza.addTopping(new PizzaTopping("Mushrooms",30, true));			
		pizza.addTopping(new PizzaTopping("Peppers",20, false));			
		pizza.addTopping(new PizzaTopping("Sweetcorn",25, true));				
	}
	
	public static void veggie(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("thin", 150, false));			
		pizza.addTopping(new PizzaTopping("Tomato Sauce",10, false));			
		pizza.addTopping(new PizzaTopping("Cheese",35, false));				
		pizza.addTopping(new PizzaTopping("Peppers",20, false));			
		pizza.addTopping(new PizzaTopping("Mushrooms",30, false));		
		pizza.addTopping(new PizzaTopping("Onions",20, false));			
		pizza.addTopping(new PizzaTopping("Sweetcorn",25, false));		
	}

	
	public static void margherita(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("thin", 150, false));			
		pizza.addTopping(new PizzaTopping("Tomato Sauce",10, false));			
		pizza.addTopping(new PizzaTopping("Cheese",35, false));		
		pizza.addTopping(new PizzaTopping("Sweetcorn",25, false));
		pizza.addTopping(new PizzaTopping("Peppers",20, false));
	}
	
			/*
			 * Non Veg Methods : 
			 */
	public static void chickenTikka(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("thin", 150, false));
		pizza.addTopping(new PizzaTopping("Grilled Chiken",40, false));	
		pizza.addTopping(new PizzaTopping("BBQ Sauce",10, false));
		pizza.addTopping(new PizzaTopping("Onions",20, false));	
	}
	
	public static void pepperBarbecueChicken(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("thik", 200, false));
		pizza.addTopping(new PizzaTopping("Barbeque chiken", 40, true));
		pizza.addTopping(new PizzaTopping("Onions",20, false));
		pizza.addTopping(new PizzaTopping("Cheese",35, false));	
		pizza.addTopping(new PizzaTopping("Bacon", 50, true));
		
	}
	
	public static void nonVegSupreme(Pizza pizza) 
	{
		pizza.setPizzaBase(new PizzaTopping("Stuffed crust", 250, false));
		pizza.addTopping(new PizzaTopping("Barbeque chiken", 40, true));
		pizza.addTopping(new PizzaTopping("Black olive", 20, false));
		pizza.addTopping(new PizzaTopping("Pepperoni", 45, true));	
		pizza.addTopping(new PizzaTopping("Bacon", 50, true));
		pizza.addTopping(new PizzaTopping("Cheese",35, false));	
	}
	
	public static void chickenPepperoni(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("Stuffed crust", 250, false));
		pizza.addTopping(new PizzaTopping("Onions",20, false));
		pizza.addTopping(new PizzaTopping("Pepperoni", 45, true));	
		pizza.addTopping(new PizzaTopping("Cheese",35, false));	
		pizza.addTopping(new PizzaTopping("Bacon", 50, true));
		pizza.addTopping(new PizzaTopping("Peppers",20, false));
		
	}
	public static void indiChickenTikka(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("thik", 200, false));
		pizza.addTopping(new PizzaTopping("Chicken Tikka", 35, true));
		pizza.addTopping(new PizzaTopping("Black olive", 20, false));
		pizza.addTopping(new PizzaTopping("Pepperoni", 45, true));	
		pizza.addTopping(new PizzaTopping("Cheese",35, false));	
		
	}
	public static void chickenDominator(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("Stuffed crust", 250, false));
		pizza.addTopping(new PizzaTopping("Barbeque chiken", 40, true));
		pizza.addTopping(new PizzaTopping("Grilled Chiken",40, false));
		pizza.addTopping(new PizzaTopping("Cheese",35, false));	
		pizza.addTopping(new PizzaTopping("Black olive", 20, false));
		pizza.addTopping(new PizzaTopping("Onions",20, false));
	}
	
	
	
	
	
	
}
