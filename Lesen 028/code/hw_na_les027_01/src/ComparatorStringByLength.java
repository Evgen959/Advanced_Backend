import java.util.Comparator;

public class ComparatorStringByLength implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
        /*if (o1.length() < o2.length()){
           return 100;
        } else  if (o1.length() < o2.length()){
            return -100;
        }
        return 0;*/
    }
}
