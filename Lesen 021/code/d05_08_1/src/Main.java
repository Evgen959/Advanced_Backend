import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Programmer("Jack", 5000));
        employees.add(new Programmer("Robert", 6800));
        employees.add(new QAEngener("John", 6000));
        employees.add(new QAEngener("Eduard", 5300));
        employees.add(new Manager("Михалыч", 5000, 3000));
        //employees.add(new Employee("Михалыч", 5000 ));

        System.out.println(employees);

        System.out.println("--------");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("---------- " + employees.get(i).getName());
            employees.get(i).salary();
        }

        System.out.println("----------------------");
        Manager manager1 = new Manager("Robert", 6800, 1000);
        Employee manager2 = new Manager("Robert", 6800, 1000);

        manager1.work();
        manager2.work();




    }
}