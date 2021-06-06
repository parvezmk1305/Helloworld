package hitday1;

//Area of the circle 

import java.util.Scanner;

public class CircleDemo
{ 
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the radius : ");
		/* we are storing the entered radius in dpouble 
		 * because a user can enter radius in decimals
		 */
	double radius = sc.nextDouble();
	//Area = PI*radius 
	double area = Math.PI * (radius * radius);
	System.out.println("The area of a circle is : " + area );
	//Circumference = 2*PI radous 
	double circumference = Math.PI * 2*radius ;
	System.out.println("The circumference of the circle is : " + circumference );
	
	}

}
