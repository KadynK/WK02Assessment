package model;

/*
 * Kadyn Krutsch - kkrutsch
 * CIS175
 * Feb 10, 2024
 */
public class MessageUtil {

	private static String message;
	
	public MessageUtil(String message) {
		this.message = message;
	}
	public static String printMessage() {
		return message;
	}
	public String greetings() { 
		return "Hello " + message + "!"; 
	}
	public int returnMessageLength() { 
		return message.length(); 
	}
}
