
package us.inest.main.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpring objA = (HelloSpring) context.getBean("helloSpring");
		objA.setMessage("I'm object A");
		objA.getMessage();
		
		HelloSpring objB = (HelloSpring) context.getBean("helloSpring");
		objB.getMessage(); //output => I'm object A :  because we configured this bean's scope as singleton
	}
}
