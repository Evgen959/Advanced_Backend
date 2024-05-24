/*
2.  Дан List<Employee>. У каждого Employee задано имя и год,
    с которого сотрудник работает в фирме. Руководство решило премировать N сотрудников,
    которые работают дольше всех.
    Напишите метод, который вернет новый List<Employee> премируемых сотрудников.
    Реализовать тесты.
    Если нет идей, подсказка на следующей странице.
    Хорошей идеей может быть отсортировать список работников по  стажу
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {



    }

    public static List<Employee> selectEmloyeeForBonus(List<Employee> list, int N){
        List<Employee> result = new ArrayList<>();
        List<Employee> sortList = sort(list, new ComparatorEmployeeByYear());
        for (int i = 0; i < Math.min(N, sortList.size()); i++) {
            result.add(sortList.get(i));
        }
        return result;
    }

    public static List<Employee> sort(List<Employee> list, Comparator<Employee> comparator){
        ArrayList<Employee> sortedEmployees = new ArrayList<>(list);
        Collections.sort(sortedEmployees, comparator);
        return sortedEmployees;
    }
}