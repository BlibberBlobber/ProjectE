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
		
		int k=5, i=1, b = 10; // b er 10 fordi vi er i 10-tals-system
		double a = 0;
		double palindrome = ((k*k) - k)/2;
		while (palindrome <= 1000000) {
			palindrome *= i;
			i++;
		}
		System.out.println(palindrome);
			
		}
		
	}



