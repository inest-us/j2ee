package us.inest.springbyexample.message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {

	/**
	* Main method.
	*/
	private static ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("DefaultMessageTest-context.xml");
		DefaultMessage message = (DefaultMessage) applicationContext.getBean("message");
		System.out.println(message.getMessage());
	}
}
