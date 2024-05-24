/*
1.  Дан список строк вида “John,18” т.е. имя,возраст. Необходимо написать метод,
    который вернет список Person. Реализовать тесты.
    Подсказка: обратите внимание на метод Integer.parseInt(),
    который позволит превратить строку “18” в число.

**/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



    }

    public static List<Person> parsePersons(List<String> list){
        List<Person> result = new ArrayList<>();
        if (list != null && !list.isEmpty()){ //!list.isEmpty() не пустой листу
            for (String s : list){
                Person person = Person.of(s);
                if (person!=null){
                    result.add(person);
                }
            }
        }
        return result;
    }
}