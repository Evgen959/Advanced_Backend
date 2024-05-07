import java.util.Arrays;

public class IntArrayHandler {
    private int capacity = 3;
    private int size;
    private  int[] intArray = new int[capacity];

    public IntArrayHandler() {
        this.size = 0;
        this.intArray = intArray;
    }

    @Override
    public String toString() {
//        return "capacity:" + capacity +
//                "\nsize:" + size +
//                "\nintArray:" + Arrays.toString(intArray);
        return Arrays.toString(Arrays.copyOf(intArray, size));
    }

//    public void nextNewNum () {
//        for (int i = 0; i < capacity + 1 ; i++) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("NewNum: ");
//            int newNum = scanner.nextInt();
//            if (newNum == 0) {
//                break;
//            }
//            addNewNum(newNum);
//            System.out.println(toString());
//
//        }
//
//    }

    public void add ( int num) {
        if (size >= intArray.length) {
            enlarge();
        }
        intArray[size++] = num;
    }

    private  void enlarge() {
        int[] temp = new int[intArray.length * 2]; //создаем новый массив
        for (int i = 0; i < intArray.length; i++) { // проходим по старому массиву
            temp[i] = intArray[i]; // переносим элементы миз старого массива в новый
        }
        intArray = temp; // переадресовываемся к новому массиву
    }

    public long sumnum () {
        long sum = 0;
        for (int i = 0; i < size; i++) {
            sum += intArray[i];  // sum = sum + intArray[i];
        }
        return sum;
    }

    public  int getnum (int index) {
        // нужно проверить значение 0<index<size -> Exception
        return  intArray[index];
    }



}
