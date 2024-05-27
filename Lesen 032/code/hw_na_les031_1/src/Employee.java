import java.util.Objects;

public class Employee {
    private String name;
    private int year;

    public Employee(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return name +
                "(" + year +
                ")";
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return year == employee.year && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}
