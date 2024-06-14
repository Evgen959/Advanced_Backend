import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Main3Test {

    @Test
    void listPersonToMap() {
        List<Person> people = List.of(
                new Person("Jack", "Jackson", 19),
                new Person("Ann", "Jackson", 17),
                new Person("Mick", "Tyson", 49),
                new Person("Nick", "Niklson", 30),
                new Person("Donald", "Duck", 15)

        );

        Map<String, Integer> expected = new HashMap<>();
        expected.put("J.Jackson", 19);
        expected.put("A.Jackson", 17);
        expected.put("M.Tyson", 49);
        expected.put("N.Niklson", 30);
        expected.put("D.Duck", 15);

        Map<String, Integer> actual = Main3.listPersonToMap(people);

        Assertions.assertEquals(expected, actual);


    }
}