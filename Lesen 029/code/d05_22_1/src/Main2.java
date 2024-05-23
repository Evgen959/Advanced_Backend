import java.util.Locale;

public class Main2 {
    public static void main(String[] args){

        String s1 = "java";
        String s2 = "hello";

        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1;
        s3 = "kotlin";  // создается новая строка

        System.out.println("---------");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("---------------");
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");

        System.out.println(str1==str2); //true сравниваються ссылки
        System.out.println(str1==str3); //false  сравниваються ссылки
        System.out.println(str1.equals(str2)); //true сравниваються объекты
        System.out.println(str1.equals(str3)); //true сравниваються объекты

        str2 = "kotlin"; // создается новая строка
        String str5 = "kotlin"; // будит смотреть на str2
        str5 = "KOTLIN"; // создается новая строка
        // при изменении в строке создается новый объект
        str5=str5.toLowerCase();
        System.out.println(str2==str5);
        System.out.println(str2.equals(str5));
    }
}
