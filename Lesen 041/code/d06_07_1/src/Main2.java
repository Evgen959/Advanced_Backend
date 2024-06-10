import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {

        Person person = new Person("Jack",32);

        Set<Person> set = new HashSet<>();
        Map<Person,Integer> map = new HashMap<>();

        set.add(person);
        map.put(person,123457);
        //......
        ///
        person.setAge(person.getAge()+1);

        System.out.println("Set: " + set);
        System.out.println("Person:" + person);
        System.out.println(set.contains(person));
        System.out.println("----------------------");
        System.out.println("map:" + map);
        System.out.println(map.get(person));


    }
}
