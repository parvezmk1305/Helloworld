package hitday1;

import java.util.Scanner;

// Calculate the area of the rectangle

public class AreaOfRectangle 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of Rectangale : ");
		double length = scanner.nextDouble();
		System.out.println("Enter the Width of Rectangle : ");
		double width = scanner.nextDouble();
		//area = length * width ;
		double area = length*width;
		System.out.println("Area of Rectangle is : " + area );
		
	}

}

