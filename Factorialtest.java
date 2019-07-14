package factorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Factorialtest {

	@Test
	void test() {
		Factorial factorial = new Factorial();
		int output = factorial.CalculateFactorial(6);
		assertEquals(720,output);
		
		
	}

}
