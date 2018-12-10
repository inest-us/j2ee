package us.inest.main.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritTest {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("InheritTestBeans.xml");
	      
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		objA.getMessage1();
		objA.getMessage2();

		HelloVietnam objB = (HelloVietnam) context.getBean("helloVietnam");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
	}

}
