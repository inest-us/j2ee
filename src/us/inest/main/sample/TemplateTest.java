package us.inest.main.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TemplateTest {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("TemplateTestBeans.xml");
	      
		HelloVietnam obj = (HelloVietnam) context.getBean("helloVietnam");
		obj.getMessage1();
		obj.getMessage2();
		obj.getMessage3();
	}
}
