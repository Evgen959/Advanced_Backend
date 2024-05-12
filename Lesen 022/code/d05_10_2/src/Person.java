import java.util.Arrays;

public class Person {
    private int id;
    private String name;
    private static int counter = 0;

    public Person(String name) {
        this.name = name;
        counter++;
        id=counter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



}
