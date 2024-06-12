import java.util.Objects;

public class Peroson {
    private String name;
    private int age;

    public Peroson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Peroson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peroson peroson = (Peroson) o;
        return age == peroson.age && Objects.equals(name, peroson.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
