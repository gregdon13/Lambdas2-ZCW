import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaSearch{

    public LambdaSearch(){}

    public void printPersons(List<Person> roster) {
        CheckPerson tester = (person -> {
            return person.getAge() > 10 && person.getAge() < 90 && person.gender == Person.Sex.MALE;
        });
        for (Person p : roster) {
            if (tester.test(p)) {
                System.out.println(p.printPerson());
            }
        }
    }
}
