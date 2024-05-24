import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void of() {
        String data = "John,18";
        Person expectedResult = new Person("John",18);

        Person actualResult = Person.of(data);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}