/*Дана строка с именами вида Jack,John,Nick,John.
Необходимо написать метод, который удалит из этой строки повторяющиеся имена.
Т.е. например, в случае строки  “Jack,John,Nick,John”
вернет строку  с именами  Jack,John,Nick*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(deleteCopy("Jack,Nick,John,Nick,John"));
    }

    public static String deleteCopy(String string){
        HashSet<String> names = new LinkedHashSet<>(Arrays.asList(string.split(",")));

        /*
        StringBuilder sb = new StringBuilder();
        for (String str:names){
            sb.append(str).append(",");
        }
        sb.setLength(sb.length()-1);
        return sb.toString();
        */

        return String.join(",",names);
    }
}