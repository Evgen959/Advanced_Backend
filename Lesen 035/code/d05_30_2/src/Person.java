public class Person {
    private String name;
    private int age;



    class Comparator implements Comparable<Person>{

        @Override
        public int compareTo(Person o1, Person o2) {
            return o1.age-o2.age;
        }
    }

    public Comparable<Person> getComparator()
}
