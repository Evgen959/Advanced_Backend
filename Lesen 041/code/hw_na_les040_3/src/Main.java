/*
Предположим, у вас есть список объектов Account { String iban, Person owner}.
У каждого клиента может быть несколько счетов. Ваша задача написать метод, который сформирует
Map<Person, List<String>>, где ключом будет владелец счета, а значением - список номеров (iban) счетов.
Подсказка: т.к. Person это ключ, система должна уметь определить равен ли один Person другому. Т.е. equals и hashCode


 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static Map<Person, List<String>> mapOwnerAccounts(List<Account> accounts){
        Map<Person, List<String>> result = new HashMap<>();

        for(Account acc: accounts){
            Person owner = acc.getOwner();
            List<String> list = result.get(owner);
            if(list==null){
                list = new ArrayList<>();
                result.put(owner,list);
            }
            list.add(acc.getIban());
        }

        return result;
    }


}