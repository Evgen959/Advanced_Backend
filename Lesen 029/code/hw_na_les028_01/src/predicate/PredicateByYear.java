package predicate;

import model.Account;

public class PredicateByYear implements AccountPredicate {
    private int year;

    public PredicateByYear(int year) {
        this.year = year;
    }

    @Override
    public boolean test(Account account) {
        return account.getOpenDate().getYear() == year;
    }
}
