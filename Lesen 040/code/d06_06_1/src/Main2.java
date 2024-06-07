import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(8);
        set.add(4);
        set.add(14);
        set.add(18);

        System.out.println(set);
        NavigableSet<Integer> integers = set.descendingSet(); // revers
        System.out.println(integers);
        //System.out.println(set.first()); //4
        //System.out.println(set.last());  //18
        //System.out.println(set.pollFirst()); // выдает первый элемент и удоляет его из сета
        //System.out.println(set.pollLast());  // выдает последний элемент и удоляет его из сета
        System.out.println(set);


        SortedSet<Integer> integers1 = set.headSet(14, true); // возвращает новый сет с
                                                                 // элементами до 14 не включая
                                                                // (true включая)
        System.out.println(integers1);
        System.out.println(set);

        SortedSet<Integer> integers2 = set.tailSet(14, true);// возвращает новый сет с
                                                                    // элементами от 14 включая
                                                                    // (true не включая)
        System.out.println(integers2);

        SortedSet<Integer> integers3 = set.subSet(8, 14);
        System.out.println(integers3);

        System.out.println(set.lower(13)); // возвращает один элемент меньше 13
        System.out.println(set.higher(13)); // возвращает один элемент больше 13

    }
}
