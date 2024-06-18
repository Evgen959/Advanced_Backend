/* 3. Дан список Person, написать метод который проверит есть ли в этом списке заданный Person

Дан список Person, написать метод который проверит есть ли в этом списке Person c  заданным email*/


import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Jack", "jack@mail.com", 10),
                new Person("Ann",  "ann@mail.com",15),
                new Person("Lena",  "lena@mail.com",8),
                new Person("Bil",  "bil@mail.com",21),
                new Person("John",  "john@mail.com",13)
        );
        System.out.println(find(people, "lena@mail.com"));
        // true
        System.out.println(people);
        // [Person{name=Jack, email='jack@mail.com', age=10}, Person{name=Ann, email='ann@mail.com',
        // age=15}, Person{name=Lena, email='lena@mail.com', age=8}, Person{name=Bil,
        // email='bil@mail.com', age=21}, Person{name=John, email='john@mail.com', age=13}]
    }

    public static boolean find(List<Person> list, Person findPerson){
        return list.indexOf(findPerson) >= 0;
    }

    public static boolean find(List<Person> list, String email){
        Optional<Person> find = list.stream()
                .filter(p -> p != null && p.getEmail().equals(email))
                .findAny();      // находим любой Person
        return find.isPresent(); // boolean метод проверяет есть ли
                                 // в списке кокой либо Person
    }
}