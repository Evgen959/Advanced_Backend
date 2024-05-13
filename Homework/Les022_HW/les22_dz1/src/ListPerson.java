import java.util.ArrayList;
import java.util.List;

public class ListPerson {

    public static void print(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public static List<Person> personOlder (List<Person> persons, int older) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > older) {
                result.add(person);
            }
        }
        return result;
    }

    public static int qantityPerson (List<Person> persons, String name) {
        int qantity = 0;
        for (Person person : persons){
            if (person.getName() == name);
            qantity ++;
        }
        return qantity;
    }
}
