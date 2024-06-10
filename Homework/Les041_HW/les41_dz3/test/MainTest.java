import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void deleteRepeatName() {
        String names = "Jack,John,Nick,John";
        String expectedResult = "Jack,John,Nick";

        String actuelResult = Main.deleteRepeatName(names);

        Assertions.assertEquals(expectedResult, actuelResult);
    }
}