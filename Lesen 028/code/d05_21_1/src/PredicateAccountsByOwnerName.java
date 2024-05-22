public class PredicateAccountsByOwnerName implements AccountPredicate {
    String name;

    public PredicateAccountsByOwnerName(String name) {
        this.name = name;
    }

    @Override
    public boolean test(Account account) {
        return account.getOwner().getName().equals(name);
    }
}
