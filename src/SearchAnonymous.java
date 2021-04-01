import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchAnonymous implements CheckPerson{
    ArrayList<Person> personList = new ArrayList<>();

    public SearchAnonymous() {}

//    public void printPersons(List<Person> roster, CheckPerson tester) {
//        for (Person p : roster) {
//            if (tester.test(p)) {
//                System.out.println(p.printPerson());
//            }
//        }
//    }

    public void printPersons(List<Person> roster, CheckPerson tester) {
        System.out.println(Arrays.toString(roster.stream()
                .filter(person -> {
                    if (tester.test(person)) {
                        return true;
                    }
                    return false;
                })
                .toArray()));
    }



    public boolean test(Person p) {
        if (p.getAge() > 10 && p.getAge() < 90 && p.gender == Person.Sex.MALE) {
            return true;
        }
        return false;
    }
}
