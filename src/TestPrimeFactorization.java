import java.util.ArrayList;

import org.junit.Test;



public class TestPrimeFactorization {

	@Test
	public void testOne() {
		assertEquals(new ArrayList<Integer>(), PrimeFactorization.generatePrimes(1));
	}
}
