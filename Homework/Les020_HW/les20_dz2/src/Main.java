/*
Задача 2
Предположим, у вас есть программа для учета различных видов транспортных средств в автопарке.
У вас есть базовый класс Vehicle, который представляет общую информацию о транспортном средстве,
такую как номер, марка, модель и год выпуска.
1. Создайте подклассы для различных типов транспортных средств, таких как Car, Truck, Bus и т. д.
2. В каждом Truck, Bus добавьте дополнительные свойства, специфичные для данного типа транспортного средства.
   Например, для Truck - грузоподъемность, для Bus - кол-во пассажиров.
3. Создайте метод drive() который выводит на экран номер транспортного средства и слово 'поехали'.
   Кроме этого, в случае Truck - метод должен выводить запись о том, что перевозим столько то тонн груза,
   а в случае Bus - столько то пассажиров.
4. В main создайте список транспортных средств и каждое "отправьте в поездку" т.е. drive()
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicle = new ArrayList<>();

        vehicle.add(new Car("AN3582", "MAN", "E80", "2017"));
        vehicle.add(new Truck("AN3732", "MAN", "D90", "2020", 20));
        vehicle.add(new Bus("AN5432", "MAN", "F170", "2013", 45));

        System.out.println(vehicle);

        System.out.println("--------------");
        for (int i = 0; i < vehicle.size(); i++) {
            vehicle.get(i).drive();
        }






    }
}