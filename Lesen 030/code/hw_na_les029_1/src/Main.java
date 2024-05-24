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

        System.out.println("Hello world!");
    }

    public static String stringHandler(String str){
        String[] nameArray = str.split(";");
        for (int i = 0; i < nameArray.length; i++) {
            nameArray[i] = toShortFio(nameArray[i]);
        }

        return join(nameArray);
    }

    public static String toShortFio(String str){
        String[] namesArray = str.split(" ");

        return "" + namesArray[0].charAt(0) + "." + namesArray[1];
    }

    public static String join(String[] array){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            result.append(array[i]).append(";");
        }
        result.setLength(result.length()-1);
        return result.toString();
    }
}