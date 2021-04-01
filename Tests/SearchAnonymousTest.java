import com.sun.tools.javac.comp.Check;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SearchAnonymousTest {

    @Test
    public void anonymousWorks() {
        SearchAnonymous searchAnonymous = new SearchAnonymous();
        Person john = new Person("John", LocalDate.of(2018, Month.FEBRUARY, 3), Person.Sex.MALE, "john@gmail.com");
        Person joan = new Person("Joan", LocalDate.of(2000, Month.FEBRUARY, 3), Person.Sex.FEMALE, "joan@gmail.com");

        searchAnonymous.personList.add(john);
        searchAnonymous.personList.add(joan);
    }
}
