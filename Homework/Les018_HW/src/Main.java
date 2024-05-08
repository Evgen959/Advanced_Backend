/* Реализовать класс IntArrayHandler, который "управляет" массивом int.
Т.е. внутри должен быть массив int[]. Реализуйте метод add(int) который позволит добавить элемент,
метод toString(), метод sum(), который посчитает сумму элементов и метод get(int index) - который
возвращает элемент по индексу. Естественно, массив должен быть "резиновый".
Реализуйте в вашей программе возможность вводить числа с клавиатуры.
Если пользователь ввел 0 - программа завершается.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IntArrayHandler intArray = getIntArray();
        System.out.println(intArray);
        System.out.println(intArray.sumnum());


    }
    public static IntArrayHandler getIntArray () {
        IntArrayHandler arrayHandler = new IntArrayHandler();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("input next int or '0' for exit");
            int inputtedInt = scanner.nextInt();
            if (inputtedInt != 0) {
                arrayHandler.add(inputtedInt);
                System.out.println(arrayHandler);
            }
            else {
                break;   // выход из цикла
            }
        }
        return arrayHandler;
    }
}