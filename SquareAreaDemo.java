package hitday1;

// Calculate the area of a square 

import java.util.Scanner;

public class SquareAreaDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Side Of Square : ");
		
		//Capture the user's input 
		Scanner scanner = new Scanner (System.in);
		
		//storing the captured value in a variable 
		double side = scanner.nextDouble();
		
		//area of square = side*side 
		double area =  side*side;
		
		System.out.println("Area of Square is : " + area );
		
	}

}
