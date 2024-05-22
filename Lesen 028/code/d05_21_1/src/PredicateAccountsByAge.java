public class PredicateAccountsByAge implements AccountPredicate{
    private int age;

    public PredicateAccountsByAge(int age) {
        this.age = age;
    }

    @Override
    public boolean test(Account account) {
        return account.getOwner().getAge()>age;
    }
}
