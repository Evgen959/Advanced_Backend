/*
4.  Дан список Student. Для каждого спортсмена задано имя и список оценок.
    Список оценок это List<Integer>. Причем каждая оценка это число от 1 до 10,
    у каждого студента не более 10 оценок. Т.е. максимальный балл,
    который может набрать студент 100.
    Напишите программу которая формирует строку вида: Jack - 19;John -23;Kate-31 где число означает,
    сколько студент не добрал до максимального балла.
    Причем, студенты должны идти в порядке возрастания “недобора”.
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Jack", 6, 9, 10, 2, 4, 8, 7));
        studentList.add(new Student("John", 7, 9, 5, 2, 8, 10, 7, 3));
        studentList.add(new Student("Kate", 2, 9, 10, 7, 4, 9, 7));
        studentList.add(new Student("Ivan", 6, 9, 10, 2, 8, 7));
        studentList.add(new Student("Olga", 6, 9, 8, 2, 4, 3, 7, 10, 10));

        //Collections.sort(studentList, new ComparatorStudentByShortfall());
        //System.out.println(studentList);
        //System.out.println("-----------------");
        //System.out.println(studentToString(studentList));

        /*Student student1 = new Student("Jack");
        student1.addGrade(8);
        student1.addGrade(6);
        student1.addGrade(4, 7, 10, 3, 6);
        *//*List<Integer> grades = student1.getGrades();
        grades.add(100);*//*
        System.out.println(student1);*/
    }

    public static String studentToString(List<Student> studentList){
        List<Student> sortedList =  createSortedCopy(studentList, new ComparatorStudentByShortfall());
        StringBuilder sb = new StringBuilder();
        for (Student s: sortedList){
            sb.append(s.getName()).append("-").append(s.getShortfall()).append(";");
        }
        sb.setLength(sb.length()-1); // обрезаем строку на один символ (;) в конце
        return sb.toString();
    }

    public  static List<Student> createSortedCopy(List<Student> list, Comparator<Student> comparator){
        ArrayList<Student> result = new ArrayList<>(list);
        Collections.sort(result, comparator);
        return result;
    }
}