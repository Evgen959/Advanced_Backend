package predicate;

import model.Account;

public interface AccountPredicate {
    boolean test(Account account);
}
