import static org.junit.Assert.*;

import org.junit.Test;

public class PolymorphTest {
	int num1 = 4;
	int num2 = 5;
	int num3 = 6;
	
	@Test
	public void test1() {
		String expected = "This is your number: " + 4;
		System.out.println(expected);
		String returned = Polymorph.doWork(num1);
		System.out.println(returned);
		if (!expected.equals(returned)){
		
		fail("This is not the number you gave");
		}
	}
	@Test
	public void test2(){
		String expected = "Your numbers multiplied together equals: " + 20;
		String returned = Polymorph.doWork(num1, num2);
		if (!expected.equals(returned)){
		fail("These numbers did not multiply correctly.");
		}
		
	}
	@Test
	public void test3(){
		String expected = "The average of these three numbers is: " + 5;
		String returned = Polymorph.doWork(num1, num2, num3);
		if (!expected.equals(returned)){
			fail("This is not the average you are looking for.");	
		}
		
		
	}

}
