import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
//System.out.println("iterator.next() = " + iterator.next());
// System.out.println("iterator.next() = " + iterator.next());

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a12");
        list.add("b12");
        list.add("c12");
        list.add("d12");
        list.add("e12");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

        for(String s: list){
            System.out.println(s);
        }
        System.out.println("------------- List iterator --- ");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.nextIndex() + ". "+listIterator.next());
        }
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previousIndex()+ ". " + listIterator.previous());
        }

        ListIterator<String> listIterator1 = list.listIterator(2);
        listIterator1.add("qwertyuiop");
        System.out.println(list);

        while (listIterator1.hasNext()){
            if(listIterator1.next().endsWith("12")){
                listIterator1.remove();
            }
        }
        System.out.println(list);


    }
}