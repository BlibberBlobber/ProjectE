import java.util.ArrayList;

/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 *  
 */
public class Euler7 {

	public static void main(String[] args) {
		boolean prime = false;
		int test = 0;
		int j = 2;
		ArrayList<Integer> primTal = new ArrayList<Integer>();
			for(int i = 2; i<300000; i++){
				System.out.println(i);
				j = 2;
				while(j<=i){
					if ((i%j) == 0 && j<i) continue;
					if (i%j != 0) {
						j++;
					}
					if (j == i) primTal.add(i);
					}
				System.out.println(primTal.toString());
				}
		int hej = primTal.get(10001);
		System.out.println(hej);
		

	}

}
