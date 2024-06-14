import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(div(19, 0));
        } catch (Exception e){
            System.out.println("что то пошло не так .......");
            System.out.println(e.getMessage());

            /* что то пошло не так .......
               / by zero   */
        }
    }

    public static double div(int a, int b){
        double res = a/b;
        return res;
    }

    /*public static int max(List<Integer> integerList){

        return res;
    }*/
}