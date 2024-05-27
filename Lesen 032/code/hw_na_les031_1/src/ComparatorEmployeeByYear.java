import java.util.Comparator;

public class ComparatorEmployeeByYear implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.getYear() - o2.getYear();
    }
}
