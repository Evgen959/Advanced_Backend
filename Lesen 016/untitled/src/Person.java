public class Person {

    public String name;
    public int age;

    public int height;

    // конструктор - это специальный метод, который используется для создания нового обьекта класса.
    // название конструктора пишется с большой буквы и совпадает с именем класса. В обозначении
    // конструктора отсутствует тип возвращаемого значения
    public Person() {
        name = "Peter";
        age = 60;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        height = 160;
    }

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    {

    }

    public void canWalk() {
        System.out.println(name + " can walk");
    }


}


