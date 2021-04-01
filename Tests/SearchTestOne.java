import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class SearchTestOne {
    @Test
    public void searchPersonOne() {
        SearchLocal searchLocal = new SearchLocal();
        Person john = new Person("John", LocalDate.of(1995, Month.FEBRUARY, 3), Person.Sex.MALE, "john@gmail.com");

        Assert.assertTrue(searchLocal.test(john));
    }

    @Test
    public void searchPersonTwo() {
        SearchLocal searchLocal = new SearchLocal();
        Person john = new Person("John", LocalDate.of(2018, Month.FEBRUARY, 3), Person.Sex.MALE, "john@gmail.com");

        Assert.assertFalse(searchLocal.test(john));
    }

    @Test
    public void searchPersonThree() {
        SearchLocal searchLocal = new SearchLocal();
        Person joan = new Person("Joan", LocalDate.of(2000, Month.FEBRUARY, 3), Person.Sex.FEMALE, "joan@gmail.com");

        Assert.assertFalse(searchLocal.test(joan));
    }
}
