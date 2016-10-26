import java.util.ArrayList;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Euler5 {

	public static void main(String[] args){
		int n=20;
		int i=20;
		ArrayList<Integer> result = new ArrayList<Integer>();
		while (n<=20){
			if(i%n==0){
				n--;
			}
			if(n==1){
				result.add(i);
				break;
			}
			if(i%n!=0){
				i++;
				n=20;
			}
		}
		System.out.println(result.toString());		
	}
}
