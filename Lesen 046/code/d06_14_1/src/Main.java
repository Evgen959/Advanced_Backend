import java.util.Scanner;

/*try {

            } catch () {

            } finally {

            }*/

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            int i1 = readInt();
            System.out.println(i1);
        }
    }

    public static int readInt1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input int:");
        int i = scanner.nextInt();
        System.out.println("---------------------");
        return i;
    }

    public static int readInt(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Input int:");
            int i = scanner.nextInt();
            System.out.println("---------------------");
            return i;
        } catch (Exception e) {
            System.out.println("not good input");
            return 0;
        } finally {
            System.out.println("finally");
        }
    }
}