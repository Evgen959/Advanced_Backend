/*
Задачи  на List
1 Допустим дан List<String>. Вам необходимо реализовать следующие методы:
    получить строку, которая является объединением всех строк в исходном листе. Например
    {“Hello”, “Java”,”Programming”} -> “HelloJavaProgramming”
  Получить аналогичную строку, но слова должны быть начиная с самого длинного до самого короткого:
    Например: {“Hello”, “Java”,”Programming”} -> “ProgrammingHelloJava”
  Если заданное слово встречается в списке более одного раза,
    заменить его на фразу “ [повтор] “ + слово:  Например:
        {“Hello”, “Java”,”Programming”,”Java”}, “java” ->
        {“Hello”, “Java”,”Programming”,”Повтор Java”}
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(List.of(
                new String("Hello"),
                new String("Java"),
                new String("Programming")

        ));

        System.out.println(stringList);
        System.out.println(concatenationListInString(stringList));
        // Collections.sort(stringList);

    }

    public static String concatenationListInString(List<String> stringList) {
        String s = "";
        for (int i = 0; i < stringList.size(); i++) {
            s += stringList.get(i);
        }
        return s;
    }

    public static String sortString(List<String> stringList){
        String s = stringList.get(0);

        return s;
    }


}