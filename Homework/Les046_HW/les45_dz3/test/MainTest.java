import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getBooleanToList() {
        List<Person> people = List.of(
                new Person("Jack", 10),
                new Person("Ann", 15),
                new Person("Lena", 8),
                new Person("Bil", 21),
                new Person("John", 13)
        );

        Boolean expected = Main.getBooleanToList(people, new Person("Lena", 8));

        Assertions.assertEquals(true, expected);
    }
}