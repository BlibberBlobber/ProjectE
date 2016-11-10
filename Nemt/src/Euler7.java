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
		ArrayList<Integer> primTal = new ArrayList<Integer>();
			for(int i = 2; i<30000; i++){
				for(int j = i-1; j>0;j--){
					test = (i%(j));
					//System.out.println(test);
					if (test != 0) {
						primTal.add(i);
						break;
					}
				}
		}
		int hej = primTal.get(10001);
		System.out.println(hej);
		

	}

}
