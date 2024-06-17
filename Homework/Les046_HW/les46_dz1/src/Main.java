/* 1. Пользователь используя Scanner числа. Ваша программа считает сумму введенных чисел.
Ваша задача, если пользователь ошибся и ввел что то типа 7лдо8р4
корректно обработать ситуацию и сделать так, что бы программа не упала,
а корректно продолжила свою работу.  Как только пользователь ввел 0 - программа завершается.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sumInt();
    }
    public static int sumInt(){
        int i1 = 0;
        for (int i = 0; i < 10000; i++) {
            int i2 = scannerInt();
            if (i2==0){
                break;
            } else {
                System.out.println("SumInt: " + (i1 += i2));
            }
        }
        return i1;
    }

    public static int scannerInt(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Input int: ");
            int i = scanner.nextInt();
            return i;
        } catch (Exception e) {
            System.out.println("not good input");
            return 0;
        } finally {
           sumInt();
        }
    }
}