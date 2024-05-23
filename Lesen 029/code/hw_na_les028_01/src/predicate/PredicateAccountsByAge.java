package predicate;

import model.Account;
import predicate.AccountPredicate;

public class PredicateAccountsByAge implements AccountPredicate {
    private int age;

    public PredicateAccountsByAge(int age) {
        this.age = age;
    }

    @Override
    public boolean test(Account account) {
        return true;
        //return account.getOwner().getAge()>age;
    }
}
