import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<String> strBox = new Box<>("qwqerwetty");
        Box<Integer> integerBox1 = new Box<>(18);

        String value = strBox.getValue();
        Integer value1 = integerBox1.getValue();

        Box2<String, Integer> box2 = new Box2<>("qwe", 10);
        System.out.println(box2);

        List<String> hello = creatrSingleElementList("hello");
        List<Integer> singleElementList = creatrSingleElementList(1);
        System.out.println(hello);
        System.out.println(singleElementList);
    }

    public static <E> List<E> creatrSingleElementList(E arg){
        ArrayList<E> list = new ArrayList<>();
        list.add(arg);
        return list;
    }
}