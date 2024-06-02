import java.util.Comparator;

public class Person {
    private String name;
    private int age;


    private class ComparatorByAge implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.age-o2.age;
        }
    }
    public Comparator<Person> getComparator(){
        return new ComparatorByAge();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
