/* 3. Дана строка с именами вида Jack,John,Nick,John. Необходимо написать метод,
который удалит из этой строки повторяющиеся имена.
Т.е. например, в случае строки  “Jack,John,Nick,John” вернет строку  с именами  Jack,John,Nick*/


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String deleteRepeatName(String names){
        String[] arrey = names.split(",");
        Set<String> set = new TreeSet<>();
        for (String name : arrey){
            set.add(name);
        }
        String result = set.toString().replace(" ", "");
        return result;
    }
}