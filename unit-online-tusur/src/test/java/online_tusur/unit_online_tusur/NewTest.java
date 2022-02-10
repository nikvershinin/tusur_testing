package online_tusur.unit_online_tusur;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.*;

public class NewTest {
	Student s = new Student();
@Test(groups= {"SimpleTests"},enabled=false)
void testAge1() {
		int age = 32;
		s.setAge(age);
	    int expectedAge = 32;
	    int actualsAge=s.getAge();
	    assertEquals(expectedAge, actualsAge);	
}

@Test(groups= {"SimpleTests"},enabled=false)
void testAge2() {
		int age = 42;
		s.setAge(age);
	    int expectedAge = 42;
	    int actualsAge=s.getAge();
	    assertEquals(expectedAge, actualsAge);	
}
@Test(groups= {"TestsforFullname"},enabled=true)
@Parameters({"age", "fn", "ln"})
void ParametricTests(@Optional("0") int age, @Optional("0") String fn, @Optional("0") String ln)
{
Student s1 = new Student();
s1.setAge(age);
s1.setFirstName(fn);
s1.setLastName(ln);
assertEquals("Stones John",s1.getFullName());
}

@DataProvider(name="data")
public static Object[][] getData(){
	  return new Object[][] {	  
	  {"John", "John"},
	  {"Smith", "Smith"},
	  {"Mark", "Mark"},
	  
	  };
}

@Test(dataProvider="data")
void TestNames(String input, String expectedName) {
	 Student s = new Student();
	 s.setFirstName(input);
	 String actual = s.getFirstName();
	 assertEquals(expectedName,actual);
}
}




