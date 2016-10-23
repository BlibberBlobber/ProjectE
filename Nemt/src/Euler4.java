import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
// Find the largest palindrome made from the product of two 3-digit numbers.

public class Euler4 {

	public static void main(String[] args) {
		/*System.out.print("Indtast et trecifret tal, som skal undersøges for palindromer: ");
		Scanner input = new Scanner(System.in);
		long factor = input.nextLong();
		
		input.close();
		//Long factor = new Long (111);
		long counter = 0;
		long i = 999;
		while (i > 100 ){ // Dette loop tester vha StringBuilder
			counter = factor * i;
			String isPalindrom = Long.toString(counter);
			String checker = new StringBuilder(isPalindrom).reverse().toString();
			if (isPalindrom.equals(checker)){
				System.out.println(factor + " * " + i + " = " + counter + " er et palindrom.");
				}
			  i--;
		}	*/
		long palindrome = 0;
		long reverse = 0;
		long remainder;
		long factor = 111;
		long i = 999;
		
		ArrayList<Long> pal = new ArrayList<Long>();
		
		for (factor = 111; factor < i; factor++){
			//System.out.println("Vi undersøger multipli af "+ factor +" og " + i +" (og nedefter)");
		while (i > 100 ){  // Dette loop tester vha MATH (dobbelt-loop-whoop-whoop)
			long counter = factor * i;
			palindrome = counter;
			remainder = 0;
			reverse = 0;
				while ( palindrome != 0) {
					remainder = palindrome % 10;
					reverse = reverse * 10 + remainder;
					palindrome = palindrome / 10;
				}
			//System.out.println(reverse + " og " + counter); // Denne skriver ud for hvert loop
			if ( reverse == counter){
				//System.out.println(factor + " * " + i + " = " + counter + " er et palindrom.");
				pal.add(counter);
				
			}
			i--;
		}
		i = 999;
		}
		
		Collections.sort(pal);
		
		long svar2 = pal.get(pal.size()-1);
		
		System.out.println("Det største palindrome tal er: " + svar2);
	}
	}



