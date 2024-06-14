import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Main2Test {

    @Test
    void stringMapToBoolean() {
        List<String> strings = List.of("Jack", "Ann", "Jack", "Lena", "Poul", "Lena");
        Map<String, Boolean> exapshen = new HashMap<>();
        exapshen.put("Jack", false);
        exapshen.put("Ann", true);
        exapshen.put("Lena", false);
        exapshen.put("Poul", true);

        Map<String, Boolean> actualMap = Main2.stringMapToBoolean(strings);
        Assertions.assertEquals(exapshen, actualMap);

    }
}