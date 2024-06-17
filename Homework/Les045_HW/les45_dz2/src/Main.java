/* 2. Дан текст (в рамках данной задачи текст не содержит знаков препинания,
слова разделены пробелом). Ваша задача написать метод, который сформирует частотный словарь,
т.е. получить map<String, Integer> где ключ - слово,
значение - сколько раз оно встречалось в тексте.*/


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static Map<String, Integer> getMapString(List<String> list){
       /* return list.stream()
                    .collect(Collectors.toMap(s -> s.split(":").getClass(), s -> s.split(":").getClass()));*/
        return null;
    }
}