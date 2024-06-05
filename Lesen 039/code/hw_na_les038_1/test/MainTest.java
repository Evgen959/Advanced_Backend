import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getAllStudents() {
        List<Student> list1 = List.of(
            new Student("Jan", "Jackobson"),
            new Student("Peter", "Peterson"),
            new Student("Mark", "Karlson"),
            new Student("Maria", "Simpson"),
            new Student("Poul", "Worker")
        );

        List<Student> list2 = List.of(
            new Student("Garry", "Potter"),
            new Student("Peter", "Peterson"),
            new Student("John", "Karlson"),
            new Student("Maria", "Simpson"),
            new Student("Mike", "Tayson"),
            new Student("Lena", "Smith")
        );

        List<Student> list3 = List.of(
            new Student("Maria", "Simpson"),
            new Student("Mike", "Tayson"),
            new Student("Lena", "Smith")
        );

        List<Student> expectedList = List.of(
                new Student("Jan", "Jackobson"),
                new Student("Peter", "Peterson"),
                new Student("Mark", "Karlson"),
                new Student("Maria", "Simpson"),
                new Student("Poul", "Worker"),
                new Student("Garry", "Potter"),
                new Student("John", "Karlson"),
                new Student("Mike", "Tayson"),
                new Student("Lena", "Smith")
        );

        List<Student> actualResult = Main.getAllStudents(list1, list2, list3);

        Assertions.assertEquals(expectedList.size(), actualResult.size());
        Assertions.assertEquals(new HashSet<>(expectedList), new HashSet<>(actualResult));
    }

    @Test
    @DisplayName("getAllCoursesStudents: regular")
    void getAllCoursesStudents() {
        List<Student> back = List.of(
                new Student("Jan", "Jackobson"),
                new Student("Peter", "Peterson"),
                new Student("Mike", "Tayson"),
                new Student("Mark", "Karlson"),
                new Student("Maria", "Simpson"),
                new Student("Poul", "Worker")
        );

        List<Student> front = List.of(
                new Student("Garry", "Potter"),
                new Student("Peter", "Peterson"),
                new Student("John", "Karlson"),
                new Student("Maria", "Simpson"),
                new Student("Mike", "Tayson"),
                new Student("Lena", "Smith")
        );

        List<Student> qa = List.of(
                new Student("Sasha", "Gromova"),
                new Student("Mike", "Tayson"),
                new Student("Peter", "Peterson"),
                new Student("Lena", "Smith")
        );

        List<Student> expectedList = List.of(
                new Student("Mike", "Tayson"),
                new Student("Peter", "Peterson")
        );

        List<Student> actualResult = Main.getAllCoursesStudents(back, front, qa);

        Assertions.assertEquals(expectedList.size(), actualResult.size());
        Assertions.assertEquals(new HashSet<>(expectedList), new HashSet<>(actualResult));
    }

    @Test
    @DisplayName("getAllCoursesStudents: regular")
    void getAllCoursesStudents1() {
        List<Student> back = List.of(
                new Student("Jan", "Jackobson"),
                new Student("Peter", "Peterson"),
                new Student("Mike", "Tayson"),
                new Student("Mark", "Karlson"),
                new Student("Maria", "Simpson"),
                new Student("Poul", "Worker")
        );

        List<Student> front = List.of(
                new Student("Garry", "Potter"),
                new Student("Peter", "Peterson"),
                new Student("John", "Karlson"),
                new Student("Maria", "Simpson"),
                new Student("Lena", "Smith")
        );

        List<Student> qa = List.of(
                new Student("Sasha", "Gromova"),
                new Student("Mike", "Tayson"),
                new Student("Lena", "Smith")
        );

        List<Student> actualResult = Main.getAllCoursesStudents(back, front, qa);

        Assertions.assertTrue(actualResult.isEmpty());
    }
}