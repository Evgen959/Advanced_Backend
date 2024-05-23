/*
1. Дана строка следующего вида:
        Ivan Ivanov;Oleg Petrov;Anna Kovaleva
т.е. строка представляет список имен и фамилий разделенный точкой с запятой.
Ваша задача написать метод который формирует строку вида:
        I.Ivanov;O.Petrov;A.Kovaleva
Подсказка:
    1) обратите внимание на метод split() у класса String.
        C его помощью вы, например, легко можете получить массив строк,
        где каждая строка имеет вид  “Ivan Ivanov”
    2) Следующий шаг: каждую строку вида “Ivan Ivanov”
        превратить в строку вида   I.Ivanov Тут тот же split() может помочь.
        Также могут оказаться полезными другие методы класса String:
        charAt(), substring(),indexOf()
    3_ Теперь все получившиеся строки нужно склеить в одну,
        естественно, используя StringBuilder
*/


public class Main {
    public static void main(String[] args) {

        String str1 = "Ivan Ivanov;Oleg Petrov;Anna Kovaleva";
        System.out.println(str1);

        System.out.println(stringInitials(stringSplit1(str1)));
        System.out.println("-------");
        stringSplit2(stringSplit1(str1));

    }

    public static String stringInitials(String[] str){
        StringBuilder result = new StringBuilder();
        for (String s : str) {
            result.append(s).append(";");
        }
        return result.toString();
    }

    public static String[] stringSplit1(String str){
        String[] str1 = str.split(";");
        String[] str2 = str1;

        return str2;
    }

    public static String[] stringSplit2(String[] str){
        String[] strings = str1;
        for (String s : str) {

            String[] str1 = s.split(" ");
            String[] str2 = str1;
            for (int i = 0; i < str1.length; i++) {
                str2 = String.valueOf(str1[0].charAt(0));
            }

        }
        return strings;
    }
}