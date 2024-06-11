/*
Объявите функциональный интерфейс MyPredicate, в котором должен быть единственный метод boolean test(Person p)
Используя ваш интерфейс реализуйте универсальный метод фильтрации списка Person.
Т.е. ваш метод должен принимать список Person и интерфейс MyPredicate который задает условие отбора
(подсказка: это очень похоже на код StringTransformer написанный в классе)
Выполните несколько вариантов отбора Person (по началу имени, по возрасту и т.д.).
Попробуйте реализовать MyPredicate с помощью лямбда выражений (стрелочных функций).
*/


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> list = List.of(
                new Person("Jeck", 20),
                new Person("John", 16),
                new Person("Nick", 28),
                new Person("Olga", 9),
                new Person("Mayk", 20)
        );
        List<Person> list1 = filterListPerson(list, new MyPredicate() {
            @Override
            public boolean test(Person p) {
                return p.getAge()==20;
            }
        });
        System.out.println(list1);

        List<Person> list2 = filterListPerson(list, (Person p) -> { return p.getAge()==28; });
        System.out.println(list2);

        List<Person> list3 = filterListPerson(list, (Person p) -> { return p.getName().charAt(0)== 'J'; });
        System.out.println(list3);
    }

    public static List<Person> filterListPerson(List<Person> list, MyPredicate predicate){
        List<Person> result = new ArrayList<>();
        for (Person person: list){
            if (predicate.test(person)){
                result.add(person);
            }
        }
        return result;
    }
}