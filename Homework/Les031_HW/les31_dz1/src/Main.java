/*
2.  Дан List<Employee>. У каждого Employee задано имя и год,
    с которого сотрудник работает в фирме. Руководство решило премировать N сотрудников,
    которые работают дольше всех.
    Напишите метод, который вернет новый List<Employee> премируемых сотрудников.
    Реализовать тесты.
    Если нет идей, подсказка на следующей странице.
    Хорошей идеей может быть отсортировать список работников по  стажу
3.  В предыдущей задачи учтите, что если например, нужно премировать 3 сотрудника,
    но при этом в компании 5 старейших сотрудников с одинаковым стажем,
    необходимо премировать всех пятерых.
    Или например, есть 2 старейших сотрудника со стажем 10 лет,
    и еще 5 со стажем 9 лет - премируем всех семерых. Реализовать тесты.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {



    }

    public static List<Employee> selectEmployeeForBonus(List<Employee> list, int N){
        List<Employee> result = new ArrayList<>();
        List<Employee> sortList = sort(list, new ComparatorEmployeeByYear());
        int quntity = quntityEmploeerepid(list, new ComparatorEmployeeByYear(), N);
        for (int i = 0; i < Math.min(quntity, sortList.size()); i++) {
            result.add(sortList.get(i));
        }
        return result;
    }

    public static List<Employee> sort(List<Employee> list, Comparator<Employee> comparator){
        ArrayList<Employee> sortedEmployees = new ArrayList<>(list);
        Collections.sort(sortedEmployees, comparator);
        return sortedEmployees;
    }

    public static Integer quntityEmploeerepid  (List<Employee> list, Comparator<Employee> comparator, int N){
        System.out.println("test");
        int quantity = 0;
        for (int i = 0; i < list.size(); i++) {
            if (comparator == null){
                quantity ++;
            }
        }
        return quantity;
    }
}