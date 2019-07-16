package numbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumOfNumbersTest {

	@Test
	void test() {
		sumOfNumbers add = new sumOfNumbers();
		int output = add.SumOfEvenNumbers(5,9);
		assertEquals(14,output);
		int output1 = add.SumOfoddNumbers(5,9);
		assertEquals(21,output1);
		
		
	}

}
