

/*The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?*/

public class Euler3 {
	
public static void main (String[] args) {
	Long primeOne = new Long ("600851475143"); 
	
	System.out.println("Vi undersøger følgende tal: "+primeOne + "\n");
	int p = 2;
	long undersogtTal = primeOne;
	while ( p <= undersogtTal ){
		if (undersogtTal%p==0) {
			undersogtTal/=p;
			System.out.println(p + " var en prim-faktor i " + primeOne);

		}
		else {
				p++;
		}
		
	}
}
}
	
