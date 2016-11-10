/* Problem 6:
 * The sum of the squares of the first ten natural numbers is,
 * 385
 * The square of the sum of the first ten natural numbers is,
 * 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 
 * 3025 - 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum. 
 */
public class Euler6 {

	public static void main(String[] args) {
		int i[] = new int[100];
		
		double sum = 0;
		double square = 0;
		double sum2 = 0;
		double result = 0;
		
		for(int b = 0; b<100; b++){
			i[b] = b+1;
		}
		
		for(int a : i){
			square =  Math.pow(a, 2);
			sum = sum + square;
			sum2 = sum2 + a;
		}
		
		sum2 = Math.pow(sum2, 2);
		result = sum2 - sum;
		System.out.println(result);
	}

}
