/*3.
Предположим, у вас есть список объектов Account { String iban, Person owner}.
У каждого клиента может быть несколько счетов. Ваша задача написать метод,
который сформирует Map<Person, List<String>>, где ключом будет владелец счета,
а значением - список номеров (iban) счетов.
Подсказка: т.к. Person это ключ, система должна уметь определить равен ли один Person другому.
Т.е. equals и hashCode*/


import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static Map<Person, List<String>> mapPerson(List<Account> owner){



        return null;
    }
}