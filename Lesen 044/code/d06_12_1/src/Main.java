import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("1", "uioyui", "fgsd", "dfsgd", "cxxvz");

        list.stream()
                .filter(s -> s.length()>2)
                .map(s -> s.substring(0,3))
                .forEach(s -> System.out.println(s));

        Random rnd = new Random();
        rnd.ints()
                .dropWhile(i->i==100)// пока генератор не выдаст 100 стрим не пойдет дальше
                .limit(5) // выдает первые 50 чисел
                .forEach(i-> System.out.println(i));

        List<Persen> people = List.of(
                new Persen("Jack1", List.of("De111", "DE112")),
                new Persen("Jack2", List.of("De113", "DE114", "DE115")),
                new Persen("Jack3", List.of("De116")),
                new Persen("Jack4", List.of("De117", "DE118"))
        );
        System.out.println("-------------------------");
        people.stream()
                .map(p->p.getIbans())
                //.flatMap(p->p.getIbans().stream())
                .forEach(s -> System.out.println(s));

        people.stream().toList();
        people.stream().collect(Collectors.toSet());

        Persen persen = people.stream()
                .filter(p -> p.getName().startsWith("A"))
                .findAny()
                .orElseGet(() -> new Persen("Artur", List.of("1234e")));

        people.stream()
                .filter(p->p.getIbans().size()>2)
                .toList();
    }
}