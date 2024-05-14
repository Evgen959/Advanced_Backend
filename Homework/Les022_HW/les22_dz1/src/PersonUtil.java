import java.util.ArrayList;
import java.util.List;

public class PersonUtil {

    private PersonUtil () {}
    public static void print(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public static List<String> personOlder (List<Person> persons, int older) {
        List<String> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > older) {
                result.add(person.getName());
            }
        }
        return result;
    }

    public static int qantityPerson (Person person, List<Person> people) {
        int qantity = 0;
        for (Person p : people){
            if (p.equals(person)){
                qantity ++;
            }
        }
        return qantity;
    }
}
