/*
    Используя итератор удалить из заданного листа String все слова,
    начинающиеся на символ “_”. Не забудьте тесты.
*/
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

   }

   public static void removeStringStartWith(List<String> list, String prefix){
       Iterator<String> iterator = list.iterator();
       while(iterator.hasNext()){
           if (iterator.next().startsWith(prefix)){
               iterator.remove();
           }
       }
   }

   public static void removeString2(List<String> list){
       Iterator<String> iterator = list.iterator();
       while(iterator.hasNext()){
           if (iterator.next().charAt(0)=='_'){
               iterator.remove();
           }
       }
   }
}