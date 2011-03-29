import java.util.ArrayList;


public class PrimeFactorization {
	public static ArrayList<Integer> generatePrimes(int n){
		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		while (n % 2 == 0) {
			tempArray.add(2);
			n= n/2;
		}
		if (n > 1) {
			tempArray.add(n);
		}
		return tempArray;
	}
}
