import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getMapStudent() {
        List<String> listStudent = List.of("Jack:43", "Ann:85", "Dick:38", "Tom:51");

        Map<String, List<Integer>> expected = new HashMap<>();
        expected.put("Jack", new ArrayList<>(43));
        expected.put("Ann", new ArrayList<>(85));
        expected.put("Dick", new ArrayList<>(38));
        expected.put("Tom", new ArrayList<>(51));

        Map<String, List<Integer>> actualmapStudent = Main.getMapStudent(listStudent);

        Assertions.assertEquals(expected, actualmapStudent);
    }
}