import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @DisplayName("addTwoKeysValue: regular case")
    @Test
    void addTwoKeysValue() {
        Map<String, Integer> map = new HashMap<>(Map.of("Jack", 18,
                                                        "John", 9,
                                                        "Ann", 5));
        String key1 ="Ann";
        String key2 ="Jack";

        Main.addTwoKeysValue(map, key1, key2);

        Integer actualValue = map.get(key1 + key2);
        Assertions.assertAll(
                ()->Assertions.assertEquals(23, actualValue),
                ()->Assertions.assertEquals(4, map.size())
        );
    }

    @DisplayName("addTwoKeysValue: if no Key 1")
    @Test
    void addTwoKeysValue_ifNoKey1() {
        Map<String, Integer> map = new HashMap<>(Map.of("Jack", 18,
                                                        "John", 9,
                                                        "Ann", 5));
        String key1 ="Lena";
        String key2 ="Jack";

        Main.addTwoKeysValue(map, key1, key2);

        Integer actualValue = map.get(key1 + key2);
        Assertions.assertNull(actualValue);
    }

    @DisplayName("addTwoKeysValue: if no Key 2")
    @Test
    void addTwoKeysValue_ifNoKey2() {
        Map<String, Integer> map = new HashMap<>(Map.of("Jack", 18,
                                                        "John", 9,
                                                        "Ann", 5));
        String key2 ="Lena";
        String key1 ="Jack";

        Main.addTwoKeysValue(map, key1, key2);

        Integer actualValue = map.get(key1 + key2);
        Assertions.assertNull(actualValue);
    }

    @DisplayName("addTwoKeysValue: if the first one value is null")
    @Test
    void addTwoKeysValue_ifValueIsNull() {
        Map<String, Integer> map = new HashMap<>(Map.of(
                "John", 9,
                "Ann", 5));
        map.put("Jack",null);
        String key1 = "Ann";
        String key2 = "Jack";

        Main.addTwoKeysValue(map, key1, key2);

        Integer actualValue = map.get(key1 + key2);
        Assertions.assertAll(
                () -> Assertions.assertEquals(5, actualValue),
                () -> Assertions.assertEquals(4, map.size())
        );
    }

    @DisplayName("addTwoKeysValue: if the second one value is null")
    @Test
    void addTwoKeysValue_ifSecondValueIsNull() {
        Map<String, Integer> map = new HashMap<>(Map.of("Jack", 18,
                "John", 9));
        map.put("Ann",null);
        String key1 = "Ann";
        String key2 = "Jack";

        Main.addTwoKeysValue(map, key1, key2);

        Integer actualValue = map.get(key1 + key2);
        Assertions.assertAll(
                () -> Assertions.assertEquals(18, actualValue),
                () -> Assertions.assertEquals(4, map.size())
        );
    }

    @DisplayName("addTwoKeysValue: if both value is null")
    @Test
    void addTwoKeysValue_ifBothValueIsNull() {
        Map<String, Integer> map = new HashMap<>(Map.of("John", 9));
        map.put("Jack",null);
        map.put("Ann",null);
        String key1 = "Ann";
        String key2 = "Jack";

        Main.addTwoKeysValue(map, key1, key2);

        Integer actualValue = map.get(key1 + key2);
        Assertions.assertAll(
                () -> Assertions.assertNull(actualValue),
                () -> Assertions.assertEquals(4, map.size())
        );
    }
}