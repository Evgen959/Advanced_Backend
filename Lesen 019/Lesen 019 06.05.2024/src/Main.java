
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a == b);


        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(str1==str2);

        Person p1 = new Person("Jack", 20);
        Person p2 = new Person("John", 20);
        Person p3 = new Person("Jack", 20);

        System.out.println("== " + (p1==p3));
        System.out.println("equals " + p1.equals(p3));
        System.out.println("equals " + p1.equals(p2));

        if (p1.hashCode()==p2.hashCode()) {
            p1.equals(p2);
        }



    }



}