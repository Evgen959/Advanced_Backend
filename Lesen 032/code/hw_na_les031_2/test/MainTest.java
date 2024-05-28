import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    @DisplayName("studentToString")
    void studentToString() {
        List<Student> data = new ArrayList<>();
        data.add(new Student("Jack", 6, 9, 10, 2, 4, 8, 7));
        data.add(new Student("John", 7, 9, 5, 2, 8, 10, 7, 3));
        data.add(new Student("Kate", 2, 9, 10, 7, 4, 9, 7));
        data.add(new Student("Ivan", 6, 9, 10, 2, 8, 7));
        data.add(new Student("Olga", 6, 9, 8, 2, 4, 3, 7, 10, 10));
        String expectedResult = "Olga-41;John-49;Kate-52;Jack-54;Ivan-58";

        String actualResult = Main.studentToString(data);

        Assertions.assertEquals(actualResult, expectedResult);
    }
}