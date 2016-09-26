import java.util.Scanner;

/*
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class Euler2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long a, b, c, sum;
		a=1; b=2; c=3;
		sum = 2;
		
		while(c<4000000){
			if(c%2==0) sum=sum+c;
			
			a = b;
			b = c;
			c = a+b;
		}
		System.out.println("evenFib = " + sum);
		scan.close();
	}
}