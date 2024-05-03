public class Truck {
    String model;
    String manufacturer;
    String color;
    int year;
    public class Main {
        // OОП  -  Обьектно-Ориентированное Программирование

        /*
        Любой обьект имеет две основные характеристики:
        1. состояние( данные, которые он хранит) - переменные
        2. поведение ( действия, которые он может совершать) - методы
         */
        public static void main(String[] args) {
            int a = 0;
            //  String
            Person person = new Person();
            person.name = "John";
            person.age = 30;
            person.height = 180;


            Person person1 = new Person();
            person1.name = "Kate";
            person1.age = 25;
            person1.height = 170;

            System.out.println(person.name);
            System.out.println(person.age);
            System.out.println(person.height);
            person.canWalk();

            System.out.println();
            Person bill = new Person("Bill", 40, 185);
            System.out.println(bill.name);
            System.out.println(bill.age);
            System.out.println(bill.height);
            bill.canWalk();

            System.out.println("Empty person");
            Person empty = new Person();
            empty.name = "Jane";
            System.out.println(empty.name);
            System.out.println(empty.age);
            System.out.println(empty.height);

            System.out.println();
            System.out.println("Two parameter constructor");
            Person bob = new Person("Bob", 19);
            System.out.println("Person's name is " + bob.name);
            System.out.println("Person's age is " + bob.age);
            System.out.println("Person's height is " + bob.height);
            bob.canWalk();


        /*
        Cоздать класс грузовик Truck, содержащий общие характеристики грузовиков:
        model, manufacturer, грузоподъемность, год выпуска, объем топливного бака, цвет,
        имя владельца

        и имеющий следующее поведение:

        1. должен уметь загружаться(load)  и при этом сообщать, если превышена его грузоподъемность
          а также сообщать сколько еще можно загрузить груза
        2. разгружаться и при этом сообщать в случае попытки разгрузить больше чем имеющийся у него
            на борту груз или попытки разгрузить отрицательный груз
        3. В случае отсутствия топлива или отсутствия груза на борту сообщать о невозможности ехать
        4. Должен уметь ездить и останавливаться
        5. уметь заправляться топливом
        6. уметь сообщать имя владельца

        Создать несколько грузовиков, протестировать их работу, сложить их в массив и вывести
        на экран информацию о производителе грузовика и его владельце
        например  truck Volvo : owner is Jack Black
                   truck MAN : owner is John Snow
         */

            Truck truck = new Truck("SuperTruck",
                    "Volvo",
                    2023,
                    "red",
                    5000,
                    500,
                    "John Snow");

            Truck truck1 = new Truck("SuperTruck1",
                    "MAN",
                    2020,
                    "yellow-black",
                    7000,
                    600,
                    "Jack Burns");

            Truck[] trucks = {truck, truck1};

            for (Truck tr : trucks) {
                System.out.println("truck " + tr.manufacturer + " : " + tr.getOwner());
            }


        }
    }

