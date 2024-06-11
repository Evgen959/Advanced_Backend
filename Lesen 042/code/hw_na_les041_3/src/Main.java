/*Дана строка с именами вида Jack,John,Nick,John.
Необходимо написать метод, который удалит из этой строки повторяющиеся имена.
Т.е. например, в случае строки  “Jack,John,Nick,John”
вернет строку  с именами  Jack,John,Nick*/


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String deleteCopy(String string){
        HashSet<String> names = new HashSet<>(Arrays.asList(string.split(",")));


        return String.join(",",names);
    }
}