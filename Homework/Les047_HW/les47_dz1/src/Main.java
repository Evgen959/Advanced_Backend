/* 1. Допустим, Ваш метод должен получить массив int размером 10x10 элементов.
Необходимо, что бы ваш метод бросал IllegalArgumentException
если размер переданного массива некорректен или вместо массива пришел null. */



public class Main {
    public static void main(String[] args) {
        int[] array = null;

        try {
            if (array.length > 100 || array == null) {
                throw new IllegalArgumentException();
            }
            intArray(array);
        }catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException");
        }catch (Exception e){

        }
    }

    public static void intArray(int[] arr){

    }
}