/*  Допустим, у вас есть  BankAccount {Peroson person, String IBAN, double balance).
Вам нужно решить следующие задачи:
 - получить список всех клиентов
 - получить список клиентов, чей баланс меньше 100
 - получить список всех IBAN
 - получить список всех IBAN, клиентов младше 16 лет
Данную задачу нужно решить не используя stream. Необходимо реализовать 1 метод,
который принимает способ обработки и способ фильтрации
(используйте стандартные функциональные интерфейсы) и возвращает результат.*/


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

    }

    public static <T,R> List<R> listHandler(List<T> list, Predicate<T> predicate, Function<T, R> function){
        List<R> resultList = new ArrayList<>();
        for (T element: list){
            if (predicate.test(element)){
                resultList.add(function.apply(element));
            }
        }
        return resultList;
    }
}