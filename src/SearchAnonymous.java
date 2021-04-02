import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SearchAnonymous{

    public SearchAnonymous() {}

    public void printPersons(List<Person> roster) {
        CheckPerson tester = new CheckPerson() {
            @Override
            public boolean test(Person p) {
                if (p.getAge() > 10 && p.getAge() < 90 && p.gender == Person.Sex.MALE) {
                    return true;
                }
                return false;
            }
        };
        for (Person p : roster) {
            if (tester.test(p)) {
                System.out.println(p.printPerson());
            }
        }
    }
}
