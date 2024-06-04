import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyLikedList();
        System.out.println(list);
        list.add("Jack");
        list.add("John");
        list.add("Nick");
        list.add("Nick1");

        System.out.println(list);
        System.out.println("------------------------");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------------------");
        for (String str: list){ // это цикл гораздобыстрее следующего
                                // т.к. он запоменает элемент который вывел последним
            System.out.println(str);
        }

        for (int i = 0; i < list.size(); i++) { // очено долго цикл переберает
                                                // т.к. он каждый раз начинает
                                                // переберать с начала
            String elment = list.get(i);
        }

        Random rnd = new Random();
        MyList<Integer> intList = new MyLikedList<>();
        for (int i = 0; i < 1000000; i++) {
            intList.add(rnd.nextInt());
        }

        System.out.println("---------- for each: ");
        Long sum = 0L;
        int counter = 0;
        for (Integer i : intList) {
            sum+=i;
            if ((++counter)%10000==0){
                System.out.println("..." + sum);
            }
        }

        System.out.println("-------- for each: " + sum);
        System.out.println();

        System.out.println("-------- for each: ");
        sum = 0L;
        for (int i = 0; i < intList.size(); i++) {
            sum+=intList.get(i);
            if (i%10000==0){
                System.out.println("..." + sum);
            }
        }
        System.out.println("-------- for each: " + sum);
        System.out.println();
    }
}