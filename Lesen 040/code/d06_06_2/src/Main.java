import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Jack", "12-12-13");
        map.put("Olga", "12-12-15");
        map.put("Nick", "12-12-18");
        map.put("Ann", "12-12-13");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Jack");
        map2.put(10, "Tom");
        map2.put(14, "Kat");
        map2.put(18, "Jack");
        System.out.println(map2);

        Map<String, Person> map3 = new HashMap<>();
        map3.put("Jack", new Person("Jack", 10));
        map3.put("Ann", new Person("Ann", 8));
        map3.put("Ted", new Person("Ted", 5));
        map3.put("Nick", new Person("Nick", 19));
        map3.put("Nick", new Person("Jack", 14));

        System.out.println(map3);

        System.out.println(map3.get("Ted"));
        System.out.println(map3.keySet());
        Collection<Person> values = map3.values();// получаем коллекцию из значений
        System.out.println(values);

        Set<Map.Entry<String, Person>> entries = map3.entrySet();

    }
}