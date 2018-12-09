package us.inest.main.sample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeScopeTest {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("Beans.xml");
		PrototypeScope objA = (PrototypeScope) context.getBean("prototypeScope");
		objA.setMessage("I'm object A");
		objA.getMessage();
		
		PrototypeScope objB = (PrototypeScope) context.getBean("prototypeScope");
		objB.getMessage(); //Hello Prototype!
	}
}
