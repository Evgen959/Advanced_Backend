package predicate;

import model.Person;
import model.Account;

public class PredicateAccountsByOwner implements AccountPredicate {
    private Person owner;

    public PredicateAccountsByOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public boolean test(Account account) {
        return account.getOwner().equals(owner);
    }
}
