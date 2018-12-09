package us.inest.main.sample;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleTest {
	
	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpring obj = (HelloSpring) context.getBean("beanLifeCycle");
		obj.getMessage();
		
		/*
		 * Here you need to register a shutdown hook registerShutdownHook() method that is declared on the AbstractApplicationContext class. 
		 * This will ensure a graceful shutdown and call the relevant destroy methods.
		 */
		context.registerShutdownHook();
		System.exit(0);
	}
}
