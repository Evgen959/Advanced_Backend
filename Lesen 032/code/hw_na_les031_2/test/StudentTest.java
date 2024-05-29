import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("addGrade")
    void addGrade() {
        int data = 6;

        List<Integer> expectedResult = List.of(6);

        Student student = new Student("J");  // для вызова не статического метода создаем объект
        student.addGrade(data);                    // вызываем метод

        List<Integer> actualResult = student.getGrades();

        Assertions.assertNotNull(actualResult);
        Assertions.assertEquals(expectedResult, actualResult);

    }



    @Test
    @DisplayName("addGrade_...grade")
    void testAddGrade() {
        int data = 6;

        List<Integer> expectedResult = Arrays.asList(6, 10, 7);

        Student student = new Student("J");
        student.addGrade(data, 10, 7);

        List<Integer> actualResult = student.getGrades();

        Assertions.assertNotNull(actualResult);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("getShortfall")
    void getShortfall() {

    }
}