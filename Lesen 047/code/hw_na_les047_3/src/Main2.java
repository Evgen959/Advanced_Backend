/* 1. Пользователь используя Scanner числа. Ваша программа считает сумму введенных чисел.
Ваша задача, если пользователь ошибся и ввел что то типа 7лдо8р4
корректно обработать ситуацию и сделать так, что бы программа не упала,
а корректно продолжила свою работу.  Как только пользователь ввел 0 - программа завершается.
*/

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

            System.out.println("Result: " + sum());

    }

    public static long sum() throws InputNotIntNumberException{ // предупреждение о не безопасности
        Scanner scanner = new Scanner(System.in);
        long result = 0;
        int number;

        while (true){ // бесконечный цикл
           System.out.println("Input next int value or '0' for exit");
           try {
               number = scanner.nextInt();
               if (number == 100) {
                   throw new Input100Exception("hi! I am an Exception");
               }
               if (number == 0) {
                   break;
               } else {
                   result += number;
               }
           }catch (Input100Exception e){
               e.info();
               System.out.println("100 .... 100 .... 100");
           } catch (Exception e){
               throw new InputNotIntNumberException();
           }
        }
       return result;
    }
}