package online_tusur.unit_online_tusur;

import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;


public class DynamicTestNg {
  //Factory with Parameters
	@Factory
	
	Object[] factoryMethod() {
		return new Object[] {
				new TestFactory(26, 26),
				new TestFactory(28, 28),
				new TestFactory(30, 30)};
	}
	}
				
class TestFactory {
	private Student s = new Student();
	private int expected, actual;
	public TestFactory(int expected, int actual) {
			this.expected = expected;
			this.actual = actual;
					}
					

	@Test
	void testAge() {
	s.setAge(actual);
	int actualValue = s.getAge();
	long id=Thread.currentThread().getId();
	    System.out.println("tread"+id);
	Assert.assertEquals(expected, actualValue);
	}
	}