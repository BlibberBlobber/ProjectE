/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Euler5 {

	public static void main(String[] args){
		int n=1;
		int i = 1;
		
		for (n = 1; i%n==0;){
			if (!(i%n==0)) i++;
			
		}
		
	}
}
