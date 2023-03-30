package Second;

import java.util.ArrayList;

public class Pizza
{																				
	private ArrayList<PizzaTopping> tops = new ArrayList<PizzaTopping>();		
	private PizzaBase base;								
	private int bInput;								
	private int tInput;								
	private int pIn;	
	
	
	
	public Pizza()									
	{										
		this.setPizzaBase(base);						
		this.tops = new ArrayList<PizzaTopping>();				
	}

	public void setPizzaBase(PizzaBase base)					
	{
		this.base = base;							
	}

	public void addTopping(PizzaTopping topping)					
	{
		tops.add(topping);
	}
	
	public double pizzaCost()							
	{
		double cost = base.getCost();						
		for(PizzaTopping topping : tops)					
		{
			cost += topping.getCost();					
		}
		return cost;								
	}
	
	public void total()								
	{

		boolean Tveg = false;
		
		String newLine = System.getProperty("line.separator");			
		System.out.print("\t---------------------------------" + newLine);	
		System.out.format("\t%15s%21s", "-Ingredients-",  "-Price- "+ newLine);		
		System.out.print("\t---------------------------------" + newLine);	
		System.out.printf("\t%-15s:%15s", base.getName(), base.getCost());	
		for(PizzaTopping topping : tops)					
		{
			System.out.printf(newLine + "\t%-15s:%15s", topping.getName(), topping.getCost());	
			if(topping.getVeg() == true)					
			{
				Tveg = true;
			}
		}

		if(base.getVeg() == true || Tveg == true)				
		{
			System.out.println("\n\n\tNot suitable for vegetarians");
		}
		else if(base.getVeg() == false && Tveg == false)			
		{
			System.out.println("\n\n\tSuitable for vegetarians");
		}
		
		System.out.printf(newLine + "\t%-15s:%15s","Total Cost", pizzaCost());		
		System.out.print(newLine + "\t---------------------------------" + newLine);	
	}
	
	

    public int getbInput()							
    {
    	return bInput;
    }	
	public void setbInput(int bInput)					
    {	
    	this.bInput = bInput;      	
    }
    
    public int gettInput()							
    {
    	return tInput;
    }	
	public void settInput(int tInput)					
    {	
    	this.tInput = tInput;      	
    }
	
    public int getpIn()														
    {
    	return pIn;
    }	
	public void setpIn(int pIn)												
    {	
    	this.pIn = pIn;      	
    }


}
