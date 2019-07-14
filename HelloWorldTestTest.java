package training.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTestTest {

	@Test
	void test() {
		HelloWorldTest junit = new HelloWorldTest();
		String output = junit.getMessage();
		assertEquals("HelloWorldTest",output);
	}

}
