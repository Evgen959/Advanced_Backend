import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> setInt = new HashSet<>();
        setInt.add(1);
        setInt.add(10);
        setInt.add(-31);
        setInt.add(9);
        setInt.add(4);
        setInt.add(-23);
        setInt.add(11);
        setInt.add(-10);
        setInt.add(7);
        setInt.add(0);
        setInt.add(43);
        System.out.println(setInt);
        setInt.remove(-10);

        boolean contains = setInt.contains(11);
        System.out.println(contains); // true

        System.out.println(setInt);

        List<Person> list = new ArrayList<>();
        list.add(new Person("Jack", 10));
        list.add(new Person("Ann", 12));
        list.add(new Person("Lena", 21));
        list.add(new Person("Jack", 10));
        list.add(new Person("John", 16));
        list.add(new Person("Ivan", 18));
        list.add(new Person("Lena", 21));
        list.add(new Person("Nick", 8));

        Set<Person> set = new HashSet<>(list);
        System.out.println(set);

        /*Random rnd = new Random();
        //Set<Integer> intList = new HashSet<>();
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            intList.add(rnd.nextInt());
        }
        System.out.println("-------------------- go ------------");


        System.out.println(intList.contains(10));
        System.out.println(intList.contains(100));
        System.out.println(intList.contains(1000));
        System.out.println(intList.contains(5000));
        System.out.println(intList.contains(-333));
        System.out.println(intList.contains(-8818));*/
    }
}