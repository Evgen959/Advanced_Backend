import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("selectEmployeeForBonus")
    void selectEmployeeForBonus() {
        List<Employee> data = new ArrayList<>();
        data.add(new Employee("John", 2020));
        data.add(new Employee("Anna", 2016));
        data.add(new Employee("Jack", 1999));
        data.add(new Employee("Mark", 1995));
        data.add(new Employee("Oleg", 2000));
        data.add(new Employee("Valerii", 2005));

        List<Employee> expectedResult = new ArrayList<>();
        expectedResult.add(new Employee("Mark", 1995));
        expectedResult.add(new Employee("Jack", 1999));
        expectedResult.add(new Employee("Oleg", 2000));

        List<Employee> actualList = Main.selectEmployeeForBonus(data, 3);

        Assertions.assertEquals(expectedResult, actualList);
    }

   /* @Test
    @DisplayName("selectEmployeeForBonus_if_EmployeeForBonus>N")
    void selectEmployeeForBonus1() {
        List<Employee> data = new ArrayList<>();
        data.add(new Employee("John", 2020));
        data.add(new Employee("Anna", 2016));
        data.add(new Employee("Jack", 1995));
        data.add(new Employee("Mark", 1995));
        data.add(new Employee("Oleg", 1995));
        data.add(new Employee("Valerii", 2005));

        List<Employee> expectedResult = new ArrayList<>();
        expectedResult.add(new Employee("Jack", 1995));
        expectedResult.add(new Employee("Mark", 1995));
        expectedResult.add(new Employee("Oleg", 1995));

        List<Employee> actualList = Main.selectEmployeeForBonus(data, 2);

        Assertions.assertEquals(expectedResult, actualList);
    }*/

    /*@Test
    @DisplayName("quntityEmploeerepid")
    void quntityEmploeerepid(){
        List<Employee> data = new ArrayList<>();
        data.add(new Employee("John", 2020));
        data.add(new Employee("Anna", 2016));
        data.add(new Employee("Jack", 1995));
        data.add(new Employee("Mark", 1995));
        data.add(new Employee("Oleg", 1995));
        data.add(new Employee("Valerii", 2005));
    }*/

}