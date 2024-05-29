import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List<Integer> list = new ArrayList<>();
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        System.out.println(list);
        System.out.println();
        System.out.println("5 находиться по индексу " + list.indexOf(5));
        System.out.println();
        System.out.println("Удалим 3");
        list.remove(Integer.valueOf(3));
        System.out.println(list);
        System.out.println();
        System.out.println("добавили 9 и 11 в лист");
        list.add(9);
        list.add(11);
        System.out.println(list);
        System.out.println();
        System.out.println("Заменили первый элемент на 100");
        list.set(0, 100);
        System.out.println(list);
    }
}