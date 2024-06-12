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

public class Main {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = List.of(
                new BankAccount(new Peroson("Jack", 20), "111111", 1000.50),
                new BankAccount(new Peroson("John", 15), "111112", 500.80),
                new BankAccount(new Peroson("Ann", 25), "111113", 13000.13),
                new BankAccount(new Peroson("Nick", 8), "111114", 25000.00),
                new BankAccount(new Peroson("Jack", 20), "111111", 50.30)
        );

        System.out.println("------------список всех клиентов--------------");
        System.out.println(transformList(bankAccounts, l -> l.getPerson().getName()));

        System.out.println("------------список клиентов, чей баланс меньше 100--------------");
        //System.out.println(transformList(bankAccounts, l -> l.getPerson().getName().getBalance()<100));

        System.out.println("------------получить список всех IBAN--------------");
        System.out.println(transformList(bankAccounts, l -> l.getIBAN()));

        System.out.println("------------получить список всех IBAN, клиентов младше 16 лет--------------");
        //System.out.println(transformList(bankAccounts, l -> l.getPerson().getName()));

    }

    public static <E,R> List<R> transformList(List<E> list, Function<E, R> transformer){
        List<R> result = new ArrayList<>();
        for (E str: list){
            result.add(transformer.apply(str));
        }
        return result;
    }
}