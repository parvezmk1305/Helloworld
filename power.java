package hitday1;

// calculate power of a number using a while loop . 

public class power {
	public static void main(String[] args) {
		
		int base = 3 ,exponent = 4; 
		long result = 1; 
		while (exponent !=0) {
			result *= base ; 
			--exponent; 
		
		}
		
		System.out.println("Answer = " + result);
	}
	
}