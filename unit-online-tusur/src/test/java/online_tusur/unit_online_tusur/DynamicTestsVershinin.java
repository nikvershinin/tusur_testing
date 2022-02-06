package online_tusur.unit_online_tusur;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestFactory;

import java.util.*;
class DynamicTestsVershinin {

@TestFactory
@Tag("positive")
Collection <DynamicTest> DynamicTest1(){
	Student s1 = new Student();
	Student s2 = new Student();
	Student s3 = new Student();
	Student[] params ={s1, s2, s3};
	s1.setAge(30);
	s2.setAge(28);
	s3.setAge(26);	
	s1.setFirstName("Cristiano");
	s2.setFirstName("Bruno");
	s3.setFirstName("David");
	s1.setLastName("Ronaldo");
	s2.setLastName("Fernandes");
	s3.setLastName("Dehea");
	
return Arrays.asList(
		DynamicTest.dynamicTest("dTest1", ()->assertEquals(28,Student.avgAge(params))),
		DynamicTest.dynamicTest("dTest2", ()->assertEquals(26,Student.minAge(params))),
		DynamicTest.dynamicTest("dTest3", ()->assertEquals(30,Student.maxAge(params))),
		DynamicTest.dynamicTest("dTest4", ()->assertEquals("Ronaldo Cristiano",s1.getFullName())),
		DynamicTest.dynamicTest("dTest5", ()->assertEquals("Fernandes Bruno",s2.getFullName())),
		DynamicTest.dynamicTest("dTest6", ()->assertEquals("Dehea David",s3.getFullName()))
		);
}}