/*
1. Дан лист <Person>. Необходимо написать метод, который возвращает List<String>
   который содержит имена всех пользователей старше 20 лет
2. Дан List<Person>. Необходимо написать метод, который вернет,
   сколько раз заданный Person встречается в данном листе.
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> prsons = new ArrayList<>();
        prsons.add(new Person("Johon", 32));
        prsons.add(new Person("Anna", 25));
        prsons.add(new Person("Jeck", 18));
        prsons.add(new Person("Max", 20));
        prsons.add(new Person("Johon", 32));
        prsons.add(new Person("Johon", 32));
        prsons.add(new Person("Katrin", 16));
        prsons.add(new Person("Egor", 30));
        prsons.add(new Person("Ivan", 43));
        prsons.add(new Person("Olga", 28));

        ListPerson.print(prsons);
        System.out.println("-------- Older 20 ---------");
        System.out.println(ListPerson.personOlder(prsons, 20));

        System.out.println("------- Qantity Person -------");
        System.out.println(ListPerson.qantityPerson(prsons, "Anna"));
    }
}