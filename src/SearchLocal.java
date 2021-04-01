import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class SearchLocal implements CheckPerson{
    ArrayList<String> personList = new ArrayList<>();

    public SearchLocal() {
    }

    public void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                System.out.println(p.printPerson());
            }
        }
    }

    @Override
    public boolean test(Person p) {
        if (p.getAge() > 10 && p.getAge() < 90 && p.gender == Person.Sex.MALE) {
            return true;
        }
        return false;
    }
}
