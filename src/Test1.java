import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.MessageUtil;

/*
 * Kadyn Krutsch - kkrutsch
 * CIS175
 * Feb 10, 2024
 */
public class Test1 {

	String message = "Hello";
	MessageUtil messageUtil = new MessageUtil(message);
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(message, MessageUtil.printMessage());
	}
	
	@Test
	public void testMessageLength() { 
		int messageLength = message.length(); 
		assertTrue(messageLength == messageUtil.returnMessageLength()); 
	}
	
	@Test public void testMessageNotNull() { 
		assertNotNull(messageUtil.printMessage()); 
	}

}
