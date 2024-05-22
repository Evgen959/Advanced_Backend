public class PredicateAccountsWithMoreTHanGivenLimit implements AccountPredicate{
    private double limitBalance;

    public PredicateAccountsWithMoreTHanGivenLimit(double limitBalance) {
        this.limitBalance = limitBalance;
    }

    @Override
    public boolean test(Account account) {
        return account.getBalance()>limitBalance;
    }
}
