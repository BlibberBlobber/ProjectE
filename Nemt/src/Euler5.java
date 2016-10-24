import java.util.ArrayList;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Euler5 {

	public static void main(String[] args){
		int n=1;
		int i=1;
		ArrayList<Integer> result = new ArrayList();
	while (i>20 && 1000>i) {
		n = 1;
		while (n<=20){
			if (i%n==0) n++;
			if (!(i%n==0)) i++;
			if (n==20){
				System.out.println(i);
				result.add(i);
			}
		} 
		i++;
		}
	
		
		
		
		
	}
}
