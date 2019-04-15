package us.inest.springbyexample.vote;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VotingBoothTest {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("VotingBoothBeans.xml");
		VotingBooth vb = (VotingBooth) context.getBean("votingBooth");
		vb.vote(new Candidate());
	}
}
