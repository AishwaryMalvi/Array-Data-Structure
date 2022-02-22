package Array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junit {

	@Test
	
		void addTest() {
			Sum obj=new Sum();
			int expectedOut=9;
			int actualOut=obj.add(3,6);
			assertEquals(expectedOut,actualOut);
			System.out.println("visited test file");
			//fail("Not yet implemented");
		

	}

}
