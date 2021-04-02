import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaSearch{
    ArrayList<Person> personList = new ArrayList<>();

    public LambdaSearch(){}

    public ArrayList<Person> printPersons(List<Person> roster) {
        ArrayList<Person> temp = new ArrayList<>();
        CheckPerson tester = (person -> {
            return person.getAge() > 10 && person.getAge() < 90 && person.gender == Person.Sex.MALE;
        });
        for (Person p : roster) {
            if (tester.test(p)) {
                temp.add(p);
                System.out.println(p.printPerson());
            }
        }
        return temp;
    }
}
