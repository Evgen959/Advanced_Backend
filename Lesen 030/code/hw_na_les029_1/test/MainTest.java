import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void stringHandler(){
        String data = "Ivan Ivanov;Oleg Petrov;Anna Kovaleva";
        String expectedResult = "I.Ivanov;O.Petrov;A.Kovaleva";

        String actualResult = Main.stringHandler(data);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void toShortFio(){
        String data = "Ivan Ivanov";
        String expectedResult = "I.Ivanov";

        String actualResult = Main.toShortFio(data);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Test
    void join() {
        String[] data = {"q1","q2","q3"};
        String expectedResult = "q1;q2;q3";

        String actualResult = Main.join(data);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}