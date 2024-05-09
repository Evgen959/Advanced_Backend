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

        List<Vehicle> list = new ArrayList<>();

        list.add( new Car("AAA1812", "audi", 2016));
        list.add( new Car("AA333", "volvo", 2020));
        list.add( new Truck("BAA978", "scania", 2020, 20));
        list.add( new Truck("c978ka77", "kamaz", 2010, 15));
        list.add( new Bus("FH359", "MAN", 2019, 45));
        //list.add( new Vehicle("FH359", "MAN", 2019)); /// ??????????


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            list.get(i).drive();
        }
    }
}