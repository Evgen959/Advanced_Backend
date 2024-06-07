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
        map.put("Jack", 6);
        map.put("John", 20);
        map.put("Olga", 3);
        map.put("Ted", 8);
        map.put("Nick", 12);
        map.put("Ann", 13);
        map.put("JackTed", 14);

        Map<String, Integer> actualResult = Main.sumOfValues(map, "Jack", "Ted");

        Assertions.assertEquals(map.containsKey(expectedResult), map.containsKey(actualResult));

    }
}