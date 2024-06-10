
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mapOwnerAccounts() {
        List<Account> accounts = List.of(
                new Account("1111", new Person("Jack", 20)),
                new Account("1114", new Person("Ann", 21)),
                new Account("1113", new Person("Jack", 20)),
                new Account("1112", new Person("Jack", 20)),
                new Account("1115", new Person("Ann", 21)),
                new Account("1116", new Person("Oleg", 23))
        );

        HashMap<Person, List<String>> expectedMap = new HashMap<>();
        expectedMap.put(new Person("Jack",20), List.of("1111","1112","1113"));
        expectedMap.put(new Person("Oleg",23), List.of("1116"));
        expectedMap.put(new Person("Ann",21), List.of("1114","1115"));

        Map<Person, List<String>> actualMap = Main.mapOwnerAccounts(accounts);

        Assertions.assertAll(
                ()->Assertions.assertEquals(expectedMap.keySet(),actualMap.keySet()),
                ()->Assertions.assertEquals( new HashSet<>(expectedMap.get(new Person("Jack",20))), new HashSet<>(actualMap.get(new Person("Jack",20)))),
                ()->Assertions.assertEquals( new HashSet<>(expectedMap.get(new Person("Oleg",23))), new HashSet<>(actualMap.get(new Person("Oleg",23)))),
                ()->Assertions.assertEquals( new HashSet<>(expectedMap.get(new Person("Ann",21))), new HashSet<>(actualMap.get(new Person("Ann",21))))
        );

    }
}