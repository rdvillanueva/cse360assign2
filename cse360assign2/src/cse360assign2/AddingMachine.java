//Ryan Villanueva
//1214267950
//my repository is public 


package cse360assign2;



public class AddingMachine 
{

	
	//establishing variables/ instances below
	
	
	private static String history = "0";//history string to keep track of values that starts at 0
	
	//private static String stringNumber ;
	
	private static int total;
	
	static AddingMachine myCalculator = new AddingMachine();//establish instance of adding machine class to call methods


	
	
	public AddingMachine () 
	{
		
		total = 0;  // not needed - included for clarity
	
	}//AddingMachine Method END

	
	

	//getTotal method below
	public static int getTotal () 
	{
	
		System.out.println("\nTotal is: " + total);//prints out total value
		
		return total;

	}//getTotal END

	
	

	//add method below
	public static void add (int value) 
	{
		
		total = total + value;//given to us
		
		history = history + " + "+  value;//keep the history up to date with each value used in add method
		
	}//add END
	
	

	//subtract method below
	public void subtract (int value) 
	{

		total = total - value;//given to us

		history = history + " - " +  value;//keep the history up to date with each value used in subtract method
		
	}//subtract END

	
	
	//toString method below
	public String toString () 
	{
		
		System.out.print( history);//print out history of add and subtract methods called
		
		return history;
	
	}//toString END


	
	//clear method below
	public void clear() 
	{

		total = 0;//reset the total to 0
		
		history = " 0 ";//reset history to start at initial value of 0

	}//clear END
	
	


}//AddingMachine END


//***END OF PROGRAM***







