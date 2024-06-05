/* 1
Предположим, вы пишете программу учета студентов компьютерных курсов.
У вас есть списки студентов нескольких групп (т.е. несколько List<Student>).
Некоторые студенты посещают занятия в нескольких группах.
Ваша задача получить список (List) всех студентов школы.*/
/* 2
Чуть сложнее. У вас есть 3 списка студентов:
    - список студентов прослушавших курс бэкенд
    - список студентов прослушавших курс фронтенд
    - список студентов прослушавших курс qa
Ваша задача получить список студентов прослушавших все три курса.*/


import java.util.*;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
    }

    public static List<Student> getAllStudents(List<Student>...lists){
        Set<Student> set = new HashSet<>();
        for (List<Student> list : lists){
            set.addAll(list);
        }
        return new ArrayList<>(set);
    }

    public static List<Student> getAllCoursesStudents1(List<Student> backEnd,
                                                      List<Student> frontEnd,
                                                      List<Student> qa){
        Set<Student> set1 = new HashSet<>(backEnd);
        Set<Student> set2 = new HashSet<>(frontEnd);
        Set<Student> set3 = new HashSet<>(qa);

        set1.retainAll(set2); // в set1 останустя только повторяющиеся студенты
        set1.retainAll(set3); // в set1 останустя только повторяющиеся студенты

        return new ArrayList<>(set1);
    }

    public static List<Student> getAllCoursesStudents2(List<Student> backEnd,
                                                      List<Student> frontEnd,
                                                      List<Student> qa){
        Set<Student> set1 = new HashSet<>(backEnd);
        Set<Student> set2 = new HashSet<>(frontEnd);
        Set<Student> set3 = new HashSet<>(qa);

        Iterator<Student> iterator = set1.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (!set2.contains(student) || !set3.contains(student)){
                iterator.remove();
            }
        }
        return new ArrayList<>(set1);
    }

    public static List<Student> getAllCoursesStudents(List<Student> backEnd,
                                                      List<Student> frontEnd,
                                                      List<Student> qa){
        Set<Student> set1 = new HashSet<>(backEnd);
        Set<Student> set2 = new HashSet<>(frontEnd);
        Set<Student> set3 = new HashSet<>(qa);
        ArrayList<Student> result = new ArrayList<>();

        for (Student student: set1){
            if (set2.contains(student) && set3.contains(student)){
                result.add(student);
            }
        }
        return result;
    }
}