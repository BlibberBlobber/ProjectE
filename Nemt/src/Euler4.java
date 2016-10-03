import java.util.Arrays;
import java.util.Scanner;

//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.

public class Euler4 {

	public static void main(String[] args) {
		Scanner primtal = new Scanner(System.in);
		int[] femPrimtal;
		femPrimtal = new int[5];
		System.out.println("Indtast fem heltal");
		femPrimtal[0] = primtal.nextInt();
		femPrimtal[1] = primtal.nextInt();
		femPrimtal[2] = primtal.nextInt();
		femPrimtal[3] = primtal.nextInt();
		femPrimtal[4] = primtal.nextInt();
		primtal.close();
		
		System.out.println("Vi undersøger følgende tal: " + Arrays.toString(femPrimtal) + "\n");
		
		int p = 2;
		for (int i =0; i < 5;) {
		while ( p <= femPrimtal[i] ){
			if (femPrimtal[i]%p==0) {
				femPrimtal[i]/=p;
				System.out.println(p + " var en prim-faktor i " + femPrimtal[i]);
			}
			else {
					p++;
			}
			}
			i++;
		}
		
	}

	}

