import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * TODO Put here a description of what this class does.
 *
 * @author localmgr.
 *         Created Mar 28, 2011.
 */
public class TestPrimeNumberGeneration {
	
	@Test
	public void testOne() {
		AssertEquals(list(),primeNumberGenerator(1));
	}

	private ArrayList<Integer> list(int... ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : ints){
			ret.add(i);
		}
		return ret;
	}
}
