import java.util.Objects;

public class BankAccount {
    private Peroson person;
    private String IBAN;
    private double balance;

    public BankAccount(Peroson person, String IBAN, double balance) {
        this.person = person;
        this.IBAN = IBAN;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "person=" + person +
                ", IBAN='" + IBAN + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Peroson getPerson() {
        return person;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(balance, that.balance) == 0 && Objects.equals(person, that.person) && Objects.equals(IBAN, that.IBAN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, IBAN, balance);
    }
}
