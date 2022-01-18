package online_tusur.unit_online_tusur;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

public class StudentTest {
	/*объект тестового класса  Student*/
	private Student s = new Student();	 	   

	    
/* проверка возраста студента, 
 выходящего за диапазон */
//	  @Test
//	  void test_assert() {
//		int age = 26;
//		s.setAge(age);
//	    int expectedAge = 26;
//	    int actualsAge=s.getAge();
//	    assertEquals(expectedAge, actualsAge);	
//
//	  }
	  
	  /* проверка возраста студента, 
	  выходящего за диапазон */
	 	  @Test
	   	  @Tag("positive")
	 	  void testAgeValid() {
	 		int age = 32;
	 		s.setAge(age);
	 	    int expectedAge = 32;
	 	    int actualsAge=s.getAge();
	 	    assertEquals(expectedAge, actualsAge);	

	 	  }
	 	  
	 	  @Test
	 	  @Tag("negative")
	 	  void testAgeInvalid() {
	 		int age = -17;
	 		s.setAge(age);
	 	    int expectedAge = 18;
	 	    int actualsAge=s.getAge();
	 	    assertEquals(expectedAge, actualsAge);	

	 	  }
	 	  @Test
	 	  @Tag("positive")
	 	  void testFirstNameValid() {
	 		String firstName = "nikolay";
	 		s.setFirstName(firstName);
	 	    String expectedFirstName = "Nikolay";
	 	    String actualsFirstName=s.getFirstName();
	 	    assertEquals(expectedFirstName, actualsFirstName);	

	 	  }
	 	  
	 	  @Test
	 	  @Tag("negative")
	 	  void testFirstNameInValid() {
	 		String firstName = "nikolay nikolay nikolay";
	 		s.setFirstName(firstName);
	 	    String expectedFirstName = "Nikolay nikolay nikolay";
	 	    String actualsFirstName=s.getFirstName();
	 	    assertEquals(expectedFirstName, actualsFirstName);	

	 	  }

	 	 @Test
	 	  @Tag("positive")
	 	  void testLastNameValid() {
	 		String lastName = "Vershinin";
	 		s.setLastName(lastName);
	 	    String expectedLastName = "Vershinin";
	 	    String actualsLastName=s.getLastName();
	 	    assertEquals(expectedLastName, actualsLastName);	

	 	  }
	 	 @Test
	 	  @Tag("negative")
	 	  void testLastNameInValid() {
	 		String lastName = "Vershinin-Klaus";
	 		s.setLastName(lastName);
	 	    String expectedLastName = "Vershinin-Klaus";
	 	    String actualsLastName=s.getLastName();
	 	    assertEquals(expectedLastName, actualsLastName);	

	 	  }
}