import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Arrays.asList( array )   преобразовываем массив в лист

        Set<String> strSet = new TreeSet<>();
        strSet.addAll(Set.of("Jeck", "John", "Lena", "Nick", "Bob"));

        Set<Integer> integer = new TreeSet<>();
        integer.add(10);
        integer.add(12);
        integer.add(7);
        integer.add(18);

        for (String str: strSet){
            System.out.println(str);
        }
        System.out.println(strSet.contains("Lena")? "Lena +" : "Lena -");

        System.out.println(strSet);

        Comparator<Person> comparatorByName = new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Comparator<Person> comparatorByAge = new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        };

        TreeSet<Person> setPerson = new TreeSet<>(comparatorByName.thenComparing(comparatorByAge));//сорнируем
                                                                                   // и по имени и по возросту
        setPerson.add(new Person("Jack", 10));
        setPerson.add(new Person("John", 19));
        setPerson.add(new Person("Nick", 7));
        setPerson.add(new Person("Ann", 16));
        setPerson.add(new Person("Nick", 7));

        System.out.println(setPerson);
    }
}