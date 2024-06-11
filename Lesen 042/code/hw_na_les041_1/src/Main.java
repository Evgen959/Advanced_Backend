/* 1. Класс Account задан следующим образом: Account{String iban, Person owner}.
Допустим вам прислали Map<Person, Account> т.е. ключ владелец счета, значение счет
(в данной задаче, считаем, что одному клиенту принадлежит один счет).
Но при пересылке в map вкрались ошибки и у некоторых записей значение не соответствует ключу
(например, счет принадлежит Джеку, а лежит по ключу Ник).
Ваша задача написать метод, который скорректирует map.*/


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }

    public static Map<Person, Account> reMapAccountToPerson(Map<Person, Account> map){
        Map<Person, Account> result = new HashMap<>();

        for (var account : new HashSet<>(map.values())){
            result.put(account.getOwner(), account);
        }
        return result;
    }

    public static void fixErrorsInMap(Map<Person, Account> map){
        HashSet<Account> errors = new HashSet<>();
        Iterator<Map.Entry<Person, Account>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Person, Account> entry = iterator.next();
            Person key = entry.getKey();
            Account account = entry.getValue();
            if (!key.equals(account.getOwner())){
                errors.add(account);
                iterator.remove();
            }
        }
        for (Account acc: errors){
            map.put(acc.getOwner(),acc);
        }
    }
}