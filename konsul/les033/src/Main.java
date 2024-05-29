import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public static void remuveName(List<String> list, String name){
       /* for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(name)){
                list.remove(i);
            }
        }*/
        //while (list.remove(name)); // list.remove(name) возвращает true если удалил элемент,
        // если удолять нечего возвращает fols и выходит из цикла
        List<String> list2 = new ArrayList<>(); // создаем новый лист и добавляем нужные строки
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(name)){
                list2.add(list.get(i));
            }
        }
    }
}