/*
Задача 2 посложнее
В программе задан список Person{ String firstName, String lastName, int age, String email}.
Реализовать следующие функции:
    1) получить список всех ФИО
    2) получить список всех e-mail
    3) получить список строк   вид “Jack Johnson; jack@mail.com” те “fName lName; email”
Подсказка: Естественно, все вышеперечисленные функции может и должен реализовать один метод,
в который в качестве параметра должен приходить список Person и реализация необходимого способа обработки.
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Ivan", "Ivanov", 19, "ivan@mail.com"),
                new Person("Sergey", "sergeev", 23, "sergey@mail.com"),
                new Person("Nikolay", "Nikolav", 21, "nikolay@mail.com"),
                new Person("Boris", "Borisov", 28, "boris@mail.com")
        );

        System.out.println(list);
        System.out.println(personListHandler(list, new GetNameFunction()));
        System.out.println(personListHandler(list, new GetEmailFunction()));

        // перемменная типа interface = объект типа вывода строки new ClassImplementation
        ToStringFunction func = new GetHameEmailStringFunction();
        System.out.println(personListHandler(list, func));


    }

    public static List<String> personListHandler(List<Person> list, ToStringFunction func){
        List<String> result = new ArrayList<>();
        for (Person p : list){
            String res = func.apply(p);
            result.add(res);
        }
        return result;
    }
}