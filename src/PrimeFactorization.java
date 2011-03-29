import java.util.ArrayList;


public class PrimeFactorization {
	public static ArrayList<Integer> generatePrimes(int n){
		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		if (n == 2) {
			tempArray.add(2);
		}
		return tempArray;
	}
}
