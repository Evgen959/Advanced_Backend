import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



    }

    public static Integer maxNumber(List<Integer> list){
        if (list==null || list.isEmpty()){
            return null;
        }
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(list.get(i), max);
        }
        return max;
    }
}