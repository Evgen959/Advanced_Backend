public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age){
            return 100;
        }if (this.age < o.age){
            return -5385;
        }
        return 0;
    }
}
