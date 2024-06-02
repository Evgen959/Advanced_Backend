import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<String> list = new ArrayList<>();
       list.add("11q");
       list.add("113qasdladas");
       list.add("5511q");
       list.add("kjhlksad");

       class StringComparatorByLength implements Comparator<String>{ // Local Inner Class

           @Override
           public int compare(String o1, String o2) {
               return o1.length()-o2.length();
           }
       }
       Collections.sort(list,new StringComparatorByLength());


    }

}