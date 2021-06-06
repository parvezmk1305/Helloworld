package hitday1;

//reverse of a numbre using while-loop

import java.util.Scanner;

public class ReverseNumberWhile
{
	public static void main(String[] args)
	{
		int num=0;
		int reversenum = 0;
		System.out.println("Input your number and press enter : ");
		//this statement will cature the user input
		Scanner in  = new Scanner(System.in);
		//capture input would be stored in number num
		num= in.nextInt();
		//while loop : logic to find out the reverse number 
		while ( num != 0)
		{
			reversenum = reversenum * 10;
			reversenum = reversenum + num%10;
			num = num/10;
		
		}
		
		System.out.println("reverse of input number is : " + reversenum);
		
	}

}
