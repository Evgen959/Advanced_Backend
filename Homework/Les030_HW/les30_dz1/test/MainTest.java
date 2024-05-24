import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void persons() {
        List<String> data = List.of("John,18", "Jack,32", "Anna,21", "Olga,25", "Gektar,21");
        List<Object> expectedResult = new Object(){"John,18", "Jack,32", "Anna,21", "Olga,25", "Gektar,21"};

        List<Object> actualResult = Main.persons(data);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}