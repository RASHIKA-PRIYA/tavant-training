package grademark;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeverificationTest {

	@Test
	void test() {
		   Gradeverification Grade = new Gradeverification();
		   String output = Grade.isPass(80);
		   assertEquals("Pass",output);
		   String output1 = Grade.markGrade(80);
		   assertEquals("Grade B",output1);
	}

}
