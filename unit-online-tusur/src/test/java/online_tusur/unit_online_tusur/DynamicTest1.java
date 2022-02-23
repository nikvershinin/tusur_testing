package online_tusur.unit_online_tusur;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class DynamicTest1 {
	  //Factory with Dataprovider
@Factory
	Object[] factoryMethod1() {
	return new Object[] {new FirstNameTest1()};}}

class FirstNameTest1 {
	@DataProvider (name="firstNamesProvider",parallel=true)
	public Object[][] firstNamesProvider(){
		return new Object[][] {
			{"Cristiano", new Student("Cristiano","Ronaldo", 26)},
			{"Bruno", new Student("Bruno","Fernandes", 26)}};}
			
@Test (dataProvider="firstNamesProvider",threadPoolSize=5)			
public void firstNames(String name, Student s) {
	long id=Thread.currentThread().getId();
    System.out.println("tread"+id);

	Assert.assertEquals(name, s.getFirstName());
}
		}