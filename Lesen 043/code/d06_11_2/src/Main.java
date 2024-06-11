import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = List.of(4, 7, -7, 1, 9, -2, 0, -1);

        List<Integer> list1 = integers.stream()
                .filter(i -> i >= 0)
                .sorted((i1,i2)-> i2-i1)
                .limit(3)
                .toList();
        System.out.println(list1);

        List<Person> people = List.of(
                new Person("Jack", 10),
                new Person("John", 17),
                new Person("Ann", 20),
                new Person("Mike", 8),
                new Person("Anton", 30),
                new Person("Oleg", 10)
        );

        List<String> names = people.stream()
                .filter(p -> p.getAge()>16)
                .map(p -> p.getName())
                .filter(n -> n.startsWith("A"))
                .toList();
        System.out.println(names);

    }
}