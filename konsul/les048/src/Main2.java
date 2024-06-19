import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {   // закрывает ресурс
                                                      // если появляется Exception
            sc.nextLine();
            int i = sc.nextInt();
            System.out.println(10/i);
            sc.nextLine();
        }catch (Exception e){

        }
    }
}
