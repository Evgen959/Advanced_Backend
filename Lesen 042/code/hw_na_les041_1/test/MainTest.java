import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void reMapAccountToPerson() {
        Map<Person, Account> inputMap = new HashMap<>();

        inputMap.put(new Person("Jack", 27), new Account("111111", new Person("Jack", 27)));
        inputMap.put(new Person("Ann", 20), new Account("111112", new Person("Lena", 27)));///
        inputMap.put(new Person("John", 27), new Account("111113", new Person("Nick", 27)));///
        inputMap.put(new Person("Klod", 31), new Account("111114", new Person("Klod", 31)));
        inputMap.put(new Person("Mike", 27), new Account("111115", new Person("Vlad", 30)));///

        Map<Person, Account> expectedMap = new HashMap<>();

        expectedMap.put(new Person("Jack", 27), new Account("111111", new Person("Jack", 27)));
        expectedMap.put(new Person("Lena", 27), new Account("111112", new Person("Lena", 27)));
        expectedMap.put(new Person("Nick", 27), new Account("111113", new Person("Nick", 27)));
        expectedMap.put(new Person("Klod", 31), new Account("111114", new Person("Klod", 31)));
        expectedMap.put(new Person("Vlad", 30), new Account("111115", new Person("Vlad", 30)));

        Map<Person, Account> actualMap = Main.reMapAccountToPerson(inputMap);

        Assertions.assertEquals(expectedMap, actualMap);
    }

    @Test
    void fixErrorsInMap() {
        Map<Person, Account> inputMap = new HashMap<>();

        inputMap.put(new Person("Jack", 27), new Account("111111", new Person("Jack", 27)));
        inputMap.put(new Person("Ann", 20), new Account("111112", new Person("Lena", 27)));///
        inputMap.put(new Person("John", 27), new Account("111113", new Person("Nick", 27)));///
        inputMap.put(new Person("Klod", 31), new Account("111114", new Person("Klod", 31)));
        inputMap.put(new Person("Mike", 27), new Account("111115", new Person("Vlad", 30)));///

        Map<Person, Account> expectedMap = new HashMap<>();

        expectedMap.put(new Person("Jack", 27), new Account("111111", new Person("Jack", 27)));
        expectedMap.put(new Person("Lena", 27), new Account("111112", new Person("Lena", 27)));
        expectedMap.put(new Person("Nick", 27), new Account("111113", new Person("Nick", 27)));
        expectedMap.put(new Person("Klod", 31), new Account("111114", new Person("Klod", 31)));
        expectedMap.put(new Person("Vlad", 30), new Account("111115", new Person("Vlad", 30)));

        Main.fixErrorsInMap(inputMap);

        Assertions.assertEquals(expectedMap, inputMap);
    }
}