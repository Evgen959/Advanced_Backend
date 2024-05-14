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

        List<Person> people = new ArrayList<>();
        people.add(new Person("Johon", 32));
        people.add(new Person("Anna", 25));
        people.add(new Person("Jeck", 18));
        people.add(new Person("Max", 20));
        people.add(new Person("Johon", 32));
        people.add(new Person("Johon", 32));
        people.add(new Person("Katrin", 16));
        people.add(new Person("Egor", 30));
        people.add(new Person("Ivan", 43));
        people.add(new Person("Olga", 28));

        PersonUtil.print(people);
        System.out.println("-------- Older 20 ---------");
        System.out.println(PersonUtil.personOlder(people, 20));

        System.out.println("------- Qantity Person -------");
        Person lookingPerson1 = new Person("Johon", 32);
        Person lookingPerson2 = new Person("Egor", 30);

        System.out.println(lookingPerson1 + " " + PersonUtil.qantityPerson(lookingPerson1, people));
        System.out.println(lookingPerson2 + " " + PersonUtil.qantityPerson(lookingPerson2, people));
    }
}