/*
    2 Сложное (по желанию): Допустим дан List<model.Account>.
    Класс model.Account определен так же как и в уроке 15:
        private String iban;
        private double balance;
        private model.Person owner;
        private model.MyDate openDate;

    Ваша задача реализовать следующий функционал:
        получить List<model.Account> всех счетов с балансом больше заданного числа
        получить List<model.Account> всех счетов заданного владельца

    Все методы, реализованные в задаче переписать как имплементацию интерфейса predicate.AccountPredicate
*/

import model.Account;
import model.MyDate;
import model.Person;
import predicate.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Account> accounts = List.of(
                new Account("DE0001", 1000.50, new Person("Jack", 20), new MyDate(10, 5, 2024)),
                new Account("DE0002", 8732.55, new Person("John", 28), new MyDate(1, 3, 2023)),
                new Account("DE0003", 7640.00, new Person("Bob", 23), new MyDate(19, 5, 2024)),
                new Account("DE0004", 12001.00, new Person("Bob", 23), new MyDate(11, 2, 2020)),
                new Account("DE0005", 123.00, new Person("Bob", 23), new MyDate(19, 5, 2018)),
                new Account("DE0006", 3800.01, new Person("Tom", 10), new MyDate(2, 5, 2020)),
                new Account("DE0007", 100.50, new Person("Alice", 16), new MyDate(6, 5, 2021)),
                new Account("DE0008", 300012.00, new Person("Nick", 32), new MyDate(7, 5, 2024))
                );

        printAccounts(accounts);
        System.out.println("------getAccountsWithMoreTHanGivenLimit----------");
        printAccounts(getAccountsWithMoreThanGivenLimit(accounts, 1500));
        System.out.println();
        System.out.println("------------getAccountsByOwner------------");
        printAccounts(getAccountsByOwner(accounts, new Person("Bob", 23)));
        System.out.println();
        //System.out.println("----------getAccountsByYear-----------");
        //printAccounts(getAccountsByOpenYear(accounts, 2024));
        System.out.println("---------PredicateByYear--------------");
        printAccounts(filterAccounts(accounts, new PredicateByYear(2024)));

        System.out.println();
        System.out.println("---------------By Age------------------");
        //printAccounts(getAccountsByOwnerAge(accounts, 20));
        //printAccounts(filterAccounts(accounts, new PredicateAccountsByAge(25)));
        printAccounts(filterAccounts(accounts, account->account.getOwner().getAge()>25));

        System.out.println("--------------PredicateAccountsByOwnerName----------------");
        printAccounts(filterAccounts(accounts, new PredicateAccountsByOwnerName("Bob")));

        System.out.println("--------------predicate.PredicateAccountsByAge-----------------");
        printAccounts(filterAccounts(accounts, new PredicateAccountsByAge(15)));

    }
    public  static void printAccounts(List<Account> accounts){
        for (Account account: accounts){
            System.out.println(account);
        }
    }

    public static  List<Account> getAccountsWithMoreThanGivenLimit(List<Account> list, double limitBalance){
        PredicateAccountByGivenLimit predicate = new PredicateAccountByGivenLimit(limitBalance);
        return filterAccounts(list,predicate);
    }

    public static List<Account> getAccountsByOwner (List<Account> list, Person owner){
        PredicateAccountsByOwner predicate = new PredicateAccountsByOwner(owner);
        return filterAccounts(list,predicate);
    }

    public static List<Account> filterAccounts(List<Account> list, AccountPredicate predicate){
        List<Account> result = new ArrayList<>();
        for (Account account: list){
            if (predicate.test(account)){       //!!!!!!!!!!!!!!!
                result.add(account);
            }
        }
        return result;
    }
}