package online_tusur.unit_online_tusur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParamTestsVershinin {
Student s = new Student();


@ParameterizedTest
@Tag("positive")
@ValueSource(ints = {34, 19, 49})
void test_ageValueSource(int param) 
{
	s.setAge(param);
	assertTrue(s.getAge()>=18);
	}


@ParameterizedTest
@Tag("positive")
@CsvFileSource(resources="FirstName.csv")
void testWithCsvSourse(String param)
{
s.setFirstName(param);
assertNotNull(s.getFirstName());
}


@ParameterizedTest
@Tag("positive")
@CsvFileSource(resources="Ages.csv")
void testWithCsvSourse1(int param)
{
s.setAge(param);
assertTrue(s.getAge()>=18);
}

@ParameterizedTest
@Tag("positive")
@CsvSource({"26, 28"})
void testWithCsvSourseAvgAge(int param1, int param2)
{
Student s1 = new Student();
Student s2 = new Student();
Student[] params ={s1, s2};
s1.setAge(param1);
s2.setAge(param2);
int expectedAvgAge = 27;
int actualAvgAge = Student.avgAge(params);

assertEquals(expectedAvgAge,actualAvgAge);
}


@ParameterizedTest
@Tag("positive")
@CsvFileSource(resources="AvgAges.csv")
void testWithCsvSourseAvgAge1(int param1, int param2)
{
Student s1 = new Student();
Student s2 = new Student();
Student[] params ={s1, s2};
s1.setAge(param1);
s2.setAge(param2);
int expectedAvgAge = 27;
int actualAvgAge = Student.avgAge(params);

assertEquals(expectedAvgAge,actualAvgAge);

}





}
