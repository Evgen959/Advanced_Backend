public class PredicateAccountsByYear implements  AccountPredicate{
    private int year;

    public PredicateAccountsByYear(int year) {
        this.year = year;
    }

    @Override
    public boolean test(Account account) {
        return account.getOpenDate().getYear() == year;
    }
}
