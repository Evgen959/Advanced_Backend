import java.util.ArrayList;
import java.util.List;

/*
Задача 1
Возьмите любую предметную область. Придумайте родительский класс и
несколько дочерних классов. Реализуйте вашу иерархию в Java.
Придумайте, какое-нибудь поведение (метод), который будет общим для
всех дочерних объектов. Где он должен быть реализован?
Переопределите это поведение (метод) в одном из дочерних классов.
Где Вы будете это реализовывать?
*/
public class Main {
    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<>();

        animals.add(new Pig("P001", 100, 1));
        animals.add(new Pig("P002", 100, 1.2));
        animals.add(new Cow("C001", 150, 10));
        animals.add(new Cow("C002", 150, 11));
        animals.add(new Goat("G001", 50, 3));
        animals.add(new Goat("G002", 50, 4));

        System.out.println(animals);
        System.out.println("-----------------");

        for (int i = 0; i < animals.size(); i++) {
            System.out.println("---  " + animals.get(i).getName());
            animals.get(i).feed();
        }

        System.out.println("------------------");
        Pig pig1 = new Pig("P001", 100, 1);
        Animals pig2 = new Pig("P001", 100, 1);
        Cow cow1 = new Cow("C001", 150, 10);
        Animals cow2 = new Cow("C001", 150, 10);
        Goat goat1 = new Goat("G001", 50, 3);
        Animals goat2 = new Goat("G001", 50, 3);

        pig1.production();
        pig2.production();
        cow1.production();
        cow2.production();
        goat1.production();
        goat2.production();

    }
}