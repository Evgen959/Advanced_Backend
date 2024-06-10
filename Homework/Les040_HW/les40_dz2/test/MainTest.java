import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void attendanceClass() {
        List<String> student = List.of("Jeck", "Ann", "Ivan", "Egor", "Olga",
                                                "Jeck", "Nick", "Ann", "Ivan", "Olga",
                                                "Jeck", "Nick", "Ann", "Ivan", "Kat", "Egor"
        );

        Map<String,Integer> expectedResult = new HashMap<>();
        expectedResult.put("Jack", 3);
        expectedResult.put("Ann", 3);
        expectedResult.put("Ivan", 3);
        expectedResult.put("Egor", 2);
        expectedResult.put("Nick", 2);
        expectedResult.put("Olga", 2);
        expectedResult.put("Kat", 1);

        Map<String, Integer> actualResult = Main.attendanceClass(student);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}