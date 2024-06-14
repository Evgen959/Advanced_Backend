import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getNameList() {
        List<Person> people = List.of(
                new Person("Jack", "Jackson", 19),
                new Person("Ann", "Jackson", 17),
                new Person("Mick", "Tyson", 49),
                new Person("Nick", "Niklson", 30),
                new Person("Donald", "Duck", 15),
                new Person("Lena", "Ivanova", 19),
                new Person("Karl", "Karlson", 49),
                new Person("Mark", "Knopler", 57)
        );

        List<String> expected = List.of(
                "J.Jackson",
                "K.Karlson",
                "L.Ivanova",
                "M.Knopler",
                "M.Tyson",
                "N.Niklson"
        );

        Assertions.assertAll(
                ()->Assertions.assertEquals(expected, Main.getNameList(people)),
                ()->Assertions.assertTrue(Main.getNameList(new ArrayList<>()).isEmpty())
        );


    }
}