
import java.util.Scanner;

/*
If we list all the natural numbers below 10 
that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000. 
 */

public class Euler1 {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert number");
		int sum = 0;
		int userInput = scan.nextInt();
		
		for(int i = 1; i!=userInput ;i++){
			if(i%3==0) sum+=i;
			if(i%5==0 && i%3!=0) sum+=i;
		}
		System.out.println("final: " + sum);
		scan.close();
	}
	
}
