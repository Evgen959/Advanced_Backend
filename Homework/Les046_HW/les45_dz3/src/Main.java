/* 3. Дан список Person, написать метод который проверит есть ли в этом списке заданный Person*/

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static Boolean getBooleanToList (List<Person> list, Person person){
        return list.stream()
                .equals(person);
    }
}