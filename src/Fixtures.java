import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*
 * Kadyn Krutsch - kkrutsch
 * CIS175
 * Feb 10, 2024
 */
public class Fixtures {

	protected int value1, value2;
	@Before
	public void setUp() throws Exception {
		value1 = 3;
		value2 = 3;
	}

	@Test
	public void test() {
		double result = value1 + value2;
		assertTrue(result == 6);
		
	}

}
