import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Person {
    ArrayList<String> personInfo = new ArrayList<>();

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person() {
        name = "";
        birthday = null;
        gender = null;
        emailAddress = "";
    }

    public Person (String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public int getAge() {
       Period period = Period.between(this.birthday, LocalDate.now());
       return period.getYears();
    }

    public String printPerson() {
        return this.name + ", " + this.birthday + ", " + this.gender + ", " + this.emailAddress;
    }
}
