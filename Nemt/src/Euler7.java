import java.util.ArrayList;

/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 *  
 */
public class Euler7 {

	public static void main(String[] args) {
		boolean prime = false;
		//int test = 0;
		int j = 2;
		int i = 1;
		ArrayList<Integer> primTal = new ArrayList<Integer>();
		primTal.add(2);
		while (primTal.size() < 10002) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
				if (i % j != 0)	prime = true;
			}
			if (prime) primTal.add(i);
			//System.out.println(primTal.toString());
			i++;
		}
		int hej = primTal.get(10000);
		System.out.println(hej);
	}
}
