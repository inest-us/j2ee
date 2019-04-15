package us.inest.springbyexample.message;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
class SetterMessageTest {

	@Autowired
	private SetterMessage message = null;
	
	/**
	* Tests message.
	*/
	@Test
	public void testMessage() {
		assertNotNull(message);	
		String msg = message.getMessage();
		assertNotNull("Message is null.", msg);
		String expectedMessage = "Spring is fun.";
		assertEquals(expectedMessage, msg);
	}
}
