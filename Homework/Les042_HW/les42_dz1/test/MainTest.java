import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void filterListPerson() {
        List<Person> list = List.of(
                new Person("Jeck", 20),
                new Person("John", 16),
                new Person("Nick", 28),
                new Person("Olga", 9),
                new Person("Mayk", 20)
        );



    }
}