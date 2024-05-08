public class Transaction {
    private Account from;
    private Account to;
    double amount;

    public Transaction(Account from, Account to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "from:" + from +
                " to:" + to +
                " amount:" + amount;
    }
}
