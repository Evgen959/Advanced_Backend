import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void removeStringStartWith_regular() {
        List<String> list = new LinkedList<>(
                List.of("John", "_Adam","_Klod", "Sad", "_Lena")
        );

        List<String> expectedList = new LinkedList<>(
                List.of("John", "Sad")
        );

        Main.removeStringStartWith(list, "_");
        Assertions.assertEquals(expectedList, list);
    }
    @Test
    void removeStringStartWith_should_remove_all_elements() {
        List<String> list = new LinkedList<>(
                List.of("_John", "_Adam","_Klod", "_Sad", "_Lena")
        );

        Main.removeStringStartWith(list, "_");
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    void removeStringStartWith_no_regular() {
        List<String> list = new LinkedList<>(
                List.of("John", "Adam", "Klod", "Sad", "Lena")
        );

        List<String> expectedList = new LinkedList<>(
                List.of("John", "Adam", "Klod", "Sad", "Lena")
        );

        Main.removeStringStartWith(list, "_");
        Assertions.assertEquals(expectedList, list);
    }
}