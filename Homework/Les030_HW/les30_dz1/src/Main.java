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
        List<String> personList = List.of(
                "John,18",
                "Jack,32",
                "Anna,21",
                "Olga,25",
                "Gektar,21"
        );

        System.out.println(persons(personList));

    }

    public static List<Object> persons(List<String> list){
        List<Object> result = new ArrayList<>();
        for (String s: list){
            result.add(toShortpersons(s.split(",")));
        }
        return result;
    }

    public static List<Object> toShortpersons(String[] str){
        List<Object> result = new ArrayList<>();
        result.add(str[0] + "(" + Integer.parseInt(str[1]) + ")");
        return result;
    }

}