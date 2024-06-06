import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>( List.of(
                new Person("Jack", 20),
                new Person("Nick", 24),
                new Person("Ann", 19),
                new Person("John", 10)
        ));

        System.out.println(people);
        Comparator<Person> comparator1 = new ComparatorByAge(); // не анонимный класс


        Comparator<Person> comparator2 = new Comparator<>() { // анонимный класс
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        /*
         class XXXX13234 implements Comparator<Person>(){
         @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
         };
         Comparator<Person> comparator2 = new XXXX13234();
        */
        Collections.sort(people, comparator2);
        System.out.println(people);

        Example e = new Example(){  // анонимный класс
            @Override
            public void method1() {
                System.out.println("hello1");
            }

            @Override
            public int method2() {
                return 0;
            }
        };
    }
}
