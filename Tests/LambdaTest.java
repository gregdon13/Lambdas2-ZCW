import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LambdaTest {

    @Test
    public void lambdaWorks() {
        //Given
        LambdaSearch lambdaSearch = new LambdaSearch();
        Person john = new Person("John", LocalDate.of(2000, Month.FEBRUARY, 3), Person.Sex.MALE, "john@gmail.com");
        Person joan = new Person("Joan", LocalDate.of(2000, Month.FEBRUARY, 3), Person.Sex.FEMALE, "joan@gmail.com");
        String expected = john.toString();

        //When
        lambdaSearch.personList.add(joan);
        lambdaSearch.personList.add(john);
        String actual = lambdaSearch.printPersons(lambdaSearch.personList).get(0).toString();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
