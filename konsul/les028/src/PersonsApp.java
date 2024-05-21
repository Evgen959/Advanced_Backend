/*
Дани список Person: "Jeck Jonhson", "Anna Rock" надо получить "J. Jonhson, A Rock"
*/


import java.util.ArrayList;
import java.util.List;

public class PersonsApp {
    public static void main(String[] args) {

        List<Person> list = List.of(
                new Person("John", "Jonson", 30),
                new Person("Anna", "Karenina", 90),
                new Person("Jeck", "Vorobey", 40)
        );
        list = new ArrayList<>(list); // эта строка не обязательна можно записать короче
        System.out.println(list);
        System.out.println("---------------------");
        System.out.println(personListToString(list));
        System.out.println("-------------------");
        System.out.println(personListToString(list, 35));

    }
    public static String personListToString(List<Person> list){
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += shortToString(list.get(i)) + "; ";
        }
        return result;
    }

    public static String personListToString(List<Person> list, int age){
        String result = "";
        for (int i = 0; i < list.size(); i++) {   // перебор списка
            if (list.get(i).getAge() > age){     // фильтр
                result += shortToString(list.get(i)) + "; ";   // действие
            }
        }
        return result;
    }

    public static String shortToString(Person person){
        return person.getFirstName().charAt(0) + ". " + person.getLastName();
    }
}