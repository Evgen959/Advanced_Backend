import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyLikedList();
        System.out.println(list);
        list.add("Jack");
        list.add("John");
        list.add("Nick");
        list.add("Nick1");

        System.out.println(list);
    }
}