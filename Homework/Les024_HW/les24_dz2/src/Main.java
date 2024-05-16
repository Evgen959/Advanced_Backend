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

        List<Person> people = new ArrayList<>();
        people.add(new Person("Jeck", "Johnson", 23, "jak@mail.com"));
        people.add(new Person("Jimm", "lorenson", 35, "jimm@mail.com"));

        PersonUtil.print(people);




    }
}