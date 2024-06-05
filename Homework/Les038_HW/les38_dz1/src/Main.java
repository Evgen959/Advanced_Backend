/* 1
Предположим, вы пишете программу учета студентов компьютерных курсов.
У вас есть списки студентов нескольких групп (т.е. несколько List<Student>).
Некоторые студенты посещают занятия в нескольких группах.
Ваша задача получить список (List) всех студентов школы.*/


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Student> group01 = new ArrayList<>();
        group01.add(new Student("Jack", "Vorobey"));
        group01.add(new Student("Ann", "Hatuay"));
        group01.add(new Student("Ivan", "Ivanov"));
        group01.add(new Student("Josher", "Gimps"));
        group01.add(new Student("Nick", "Nikolson"));
        List<Student> group02 = new ArrayList<>();
        group02.add(new Student("Jan", "Reno"));
        group02.add(new Student("Ann", "Hatuay"));
        group02.add(new Student("Lena", "Kushnarova"));
        group02.add(new Student("Josher", "Gimps"));
        List<Student> group03 = new ArrayList<>();
        group03.add(new Student("July", "Roberc"));
        group03.add(new Student("Vasiliy", "Vishnevskiy"));
        group03.add(new Student("Nikol", "Nikolson"));
        group03.add(new Student("Josher", "Gimps"));

        System.out.println("--------studentSet----------");
        Set<Student> studentSet = new HashSet<>();
        studentSet.addAll(group01);
        studentSet.addAll(group02);
        studentSet.addAll(group03);
        System.out.println(studentSet);

        System.out.println("---------studentList---------");
        List<Student> studentList = new ArrayList<>(studentSet);
        System.out.println(studentList);
    }
}