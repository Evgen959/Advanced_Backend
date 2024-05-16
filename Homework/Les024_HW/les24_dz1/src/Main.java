/*Задача 1
       a) Необходимо создать интерфейс Swimmable (Плавающий). В нем должен быть один метода swim (плыть).
       b) Создайте несколько классов, реализующих этот интерфейс (Duck (утка), Boat(лодка), Person (человек).
       c) Создайте лист из нескольких объектов Swimmable и заставье все их плыть.
  */


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Swimmable> swimmables = new ArrayList<>();
        swimmables.add(new Duck());
        swimmables.add(new Boat());
        swimmables.add(new Person());

        start(swimmables);
    }

    public static void start(List<Swimmable> swimmables){
        for (Swimmable swimmable : swimmables) {
            System.out.println(swimmable.getName());
            swimmable.swim();
        }
    }
}