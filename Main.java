package hitday1;

import java.util.Scanner;

//Calculator program using Switch - case 

public class Main 
{
  public static void main(String[] args) {
	char operator; 
	Double number1,number2 ,result;
	
	//create an object of Scanner class 
	Scanner input = new Scanner (System.in);
	
	//ask the user to enter operator 
	System.out.println("Choose a operator : +, -, *, or /");
	operator = input.next().charAt(0);
	
	//ask user to enter the number 
	System.out.println("Enter the first number : ");
	number1 = input.nextDouble();
	
	System.out.println("Enter the second number : ");
	number2 = input.nextDouble();
	
	switch(operator)
	{
	 // performs addition between numbers 
	case '+' : 
		result = number1 + number2; 
		System.out.println(number1 + " + " + number2 + " = " + result);
		break; 
		
		//performs subraction between numbers 
	case '-': 
	result = number1 - number2;
	System.out.println(number1 + " _ " + number2 + " = " + result );
	break;
	
	   //performs multiplication between numbers 
	
	case '*' : 
		result = number1 * number2 ;
		System.out.println( number1 + " * " + number2 + " = " + result );
		break;
		
		//performs division between numbers 
	case '/':
		result = number1 / number2;
		System.out.println( number1 + "/" + number2 + "/" + result );
		break;
		
		default : 
			System.out.println("Invalid operator ! ");
			break;
			}
	input.close();  
	}

}
