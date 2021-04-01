import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaSearch implements CheckPerson{
    ArrayList<Person> personList = new ArrayList<>();

    public LambdaSearch(){}

    public void printPersons(List<Person> roster, CheckPerson tester) {
        System.out.println(Arrays.toString(roster
                .stream()
                .filter(tester::test)
                .toArray()));
    }

    @Override
    public boolean test(Person p) {
        if (p.getAge() > 10 && p.getAge() < 90 && p.gender == Person.Sex.MALE) {
            return true;
        }
        return false;
    }
}
