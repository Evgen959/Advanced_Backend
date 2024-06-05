/* 2
Чуть сложнее. У вас есть 3 списка студентов:
    - список студентов прослушавших курс бэкенд
    - список студентов прослушавших курс фронтенд
    - список студентов прослушавших курс qa
Ваша задача получить список студентов прослушавших все три курса.*/



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Student> backend = new ArrayList<>();
        backend.add(new Student("Jack", "Vorobey"));
        backend.add(new Student("Ann", "Hatuay"));
        backend.add(new Student("Ivan", "Ivanov"));
        backend.add(new Student("Josher", "Gimps"));
        backend.add(new Student("Nick", "Nikolson"));
        List<Student> frontend = new ArrayList<>();
        frontend.add(new Student("Jan", "Reno"));
        frontend.add(new Student("Ann", "Hatuay"));
        frontend.add(new Student("Lena", "Kushnarova"));
        frontend.add(new Student("Josher", "Gimps"));
        List<Student> qa = new ArrayList<>();
        qa.add(new Student("July", "Roberc"));
        qa.add(new Student("Vasiliy", "Vishnevskiy"));
        qa.add(new Student("Nikol", "Nikolson"));
        qa.add(new Student("Josher", "Gimps"));

        System.out.println(listStudentsBackendFrontengQA(backend, frontend, qa));
    }

    public static List<Student> listStudentsBackendFrontengQA(List<Student> list1, List<Student> list2, List<Student> list3){
        List<Student> result1 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))){
                result1.add(list1.get(i));
            }
        }
        List<Student> result2 = new ArrayList<>();
        for (int i = 0; i < list3.size(); i++) {
            if (result1.contains(list3.get(i))){
                result2.add(list1.get(i));
            }
        }
        return result2;
    }
}