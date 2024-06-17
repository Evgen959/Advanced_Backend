/* 1. Дан список строк вида: ‘Jack:43’ т.е. формат ‘Имя_студента:Оценка’.
Написать метод, который сформирует Map<String, List<Integer>> такой,
что ключ - имя студента, а значение список его оценок.*/


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static Map<String, List<Integer>> getMapStudent(List<String> list){
        return null;
                //.collect(Collectors.toMap(s -> s.split(":").getClass(0), new List<Integer>(s -> s.split(":").getClass(0))));
                //.flatMap(s -> s.split(":").getClass(0), s->s.s)
    }
}