/*A program that converts a decimal number to a binary number
using recursion

Joshua Ferguson

*/
import java.util.Scanner;

public class DecimalToBinary{
	
	public static String decimalToBinary( int n )
	{
	  

	  if ( n == 0 || n == 1 )
	     return n + "";
	  else
	    return decimalToBinary( n / 2 ) + n % 2;    
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int user_input = -1;
		
		
		
		while (user_input < 0) {
			System.out.print("Please enter a positive integer to convert to binary: ");
			user_input = scan.nextInt();
		}
		String binary_output= decimalToBinary(user_input);
		
		System.out.println(user_input +" converted to binary is "+ binary_output);
	}
}