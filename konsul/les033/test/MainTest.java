import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("remuveName")
    void remuveName() {
        ArrayList<String> data = new ArrayList<>(List.of("Jeck", "John", "Poul", "Nick", "John"));
        ArrayList<String> expected = new ArrayList<>(List.of("Jeck", "Poul", "Nick"));
        String str = new String("John");

        Main.remuveName(data, str);

        Assertions.assertEquals(expected, data);

    }

    @Test
    @DisplayName("remuveName1")
    void remuveName1() {
        ArrayList<String> data = new ArrayList<>(List.of("Jeck", "John", "John", "John", "Poul", "Nick", "John"));
        ArrayList<String> expected = new ArrayList<>(List.of("Jeck", "Poul", "Nick"));
        String str = new String("John");

        Main.remuveName(data, str);

        Assertions.assertEquals(expected, data);

    }
}