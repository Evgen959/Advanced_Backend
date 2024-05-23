import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args){

        List<String> names = new ArrayList<>();
        names.add("Stan");
        names.add("Stan");
        names.add("Stan");
        names.add("Stan");
        names.add("Stan");

        System.out.println(join(names));
        System.out.println(join2(names));
    }

    public static String join(List<String> list){
        String result = "";
        for (String str :list){
            result += str; //создается каждый раз новая строка
        }
        return result;
    }

    public static String join2(List<String> list){
        StringBuilder result = new StringBuilder(); // создаем StringBuilder
                                                    // (для однопоточной среды)
        //StringBuffer result new StringBuffer();   // такойже как StringBuilder
                                                    // для многопоточной среды
        for (String str :list){                     // собираем "строку" используя StringBuilder
            result.append(str).append("|").append(1244467);
        }
        return result.toString();                    // StringBuilder -> String
    }
}
