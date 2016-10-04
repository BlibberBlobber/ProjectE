import java.util.Arrays;
import java.util.Scanner;

// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
// Find the largest palindrome made from the product of two 3-digit numbers.

// Når man ganger to 3-digit tal får man et tal x*10^5 hvorfor der er 1099
// forskellige palindrom-tal i denne størrelsesorden. 
// Det palindrom-tal vi leder efter er summen af k+1 digits (her er k=5) for i=0 og 
// 
public class Euler4 {

	public static void main(String[] args) {
		
		// forsøge at lave den sum-funktion som skal give os palindromet
		
		Long factor = new Long (999);
		Long counter = new Long (factor), i = new Long (factor-1);
		while (i <= counter && i != 0){
			counter = counter * i;
			String isPalindrom = Long.toString(counter);
			new StringBuilder().reverse().toString();
			System.out.println(counter);
			System.out.println();
			  i--;;
			//if (isPalindrom == checker){
			//	System.out.println(counter + " er et palindrom.");
			//}
		}
		
			
		}
		
	}



