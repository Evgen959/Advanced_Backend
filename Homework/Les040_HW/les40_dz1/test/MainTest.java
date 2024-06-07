import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sumOfValues() {
        Map<String,Integer> map = new HashMap<>();
        map.put("Jack", 6);
        map.put("John", 20);
        map.put("Olga", 3);
        map.put("Ted", 8);
        map.put("Nick", 12);
        map.put("Ann", 13);

        Map<String,Integer> expectedResult = new HashMap<>();
        expectedResult.put("Jack", 6);
        expectedResult.put("John", 20);
        expectedResult.put("Olga", 3);
        expectedResult.put("Ted", 8);
        expectedResult.put("Nick", 12);
        expectedResult.put("Ann", 13);
        expectedResult.put("JackTed", 14);

        Map<String, Integer> actualResult = Main.sumOfValues(map, "Jack", "Ted");

        Assertions.assertEquals(expectedResult, actualResult);

    }
}