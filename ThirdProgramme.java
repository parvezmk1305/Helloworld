package hitday1;
//Swapping of two numbers 

public class ThirdProgramme
{
	public static void main(String[] args) 
	{
		int first = 120, second = 220;
		System.out.println("--Before swap--");
		System.out.println("First number = "+ first);
		System.out.println("second number = " + second );
		
		//value of first is assigned to temporary
		int temporary = first;
		
		// value of second is assigned to first 
		first = second; 
		
		// value of temporary (which contains the initial value of first ) is assigned to second 
		second = temporary;
		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = "+ second );
	}

}
