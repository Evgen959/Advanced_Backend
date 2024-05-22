import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Задачи  на List
1. Допустим дан List<String>. Вам необходимо реализовать следующие методы:
    получить строку, которая является объединением всех строк в исходном листе. Например
    {“Hello”, “Java”,”Programming”} -> “HelloJavaProgramming”
2. Получить аналогичную строку, но слова должны быть начиная с самого длинного
до самого короткого:
    Например: {“Hello”, “Java”,”Programming”} -> “ProgrammingHelloJava”
3. Если заданное слово встречается в списке более одного раза,
    заменить его на фразу “ [повтор] “ + слово:  Например:
        {“Hello”, “Java”,”Programming”,”Java”}, “java” ->
        {“Hello”, “Java”,”Programming”,”Повтор Java”}
*/
public class Main {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(List.of(
                "Jack", "Ann", "Igor", "Ann", "Tomas", "Bob", "Olexander", "Ann"));
        System.out.println(strings);
        System.out.println("1. Результат: " + join(strings));
        System.out.println("2. Результат: " + joinByList(strings));
        System.out.println(strings);
        System.out.println("3. Результат: " + changeRepeatString(strings, "Ann"));
        System.out.println("3. Результат: " + changeRepeatString2(strings, "Ann"));
    }

    public static String join(List<String> list){
        String result = "";  // Аккамулятор или коллектор
        for (String str :list){
            result += str;
        }
        return result;
    }

    public static String joinByList(List<String> list){
        List copyList = new ArrayList(list); // делаем копию чтоб не портить исходный лист
        Collections.sort(copyList, new ComparatorStringByLength());
        return join(copyList);
    }

    public static List<String> changeRepeatString(List<String> list, String str){
        List<String> result = new ArrayList<>();
        int counter = 0;
        for (String s: list){
            if (s.equals(str)){
                counter ++;
                String povtorString = (counter>1) ? "[Повтор " + (counter-1) + "] " : "";
                result.add(povtorString + s);
            } else {
                result.add(s);
            }
        }
        return result;
    }

    public static List<String> changeRepeatString2(List<String> list, String str){
        List<String> result = new ArrayList<>();
        boolean isRepeer = false;
        for (String s: list){
            if (s.equals(str)){
                String povtorString = isRepeer ? "[Повтор] " : "";
                isRepeer = true;
                result.add(povtorString + s);
            } else {
                result.add(s);
            }
        }
        return result;
    }
}