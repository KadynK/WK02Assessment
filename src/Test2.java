import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.MessageUtil;
/*
 * Kadyn Krutsch - kkrutsch
 * CIS175
 * Feb 10, 2024
 */
public class Test2 {

	String message = "World";
	MessageUtil messageUtil = new MessageUtil(message);
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String messageStatement = "Hello World!";
		assertEquals(messageStatement, messageUtil.greetings());
	}

}
