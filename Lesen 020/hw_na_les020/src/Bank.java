import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String title;
    private List<Account> listAccount = new ArrayList<>();
    private TransactionsList transactionsList = new TransactionsList();

    public Bank(String title, Account[] array) {
        this.title = title;
        addNewAccount(array);
    }

    public Bank(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Bank:  " + title
                +  "\nВсего счетов: "
                + listAccount.size()
                + "\nСчета:\n"
                + accuntsToString();
    }

    private String accuntsToString() {
        String res = "";
        for (int i = 0; i < listAccount.size() ; i++) {
            res +=listAccount.get(i) + "\n";
        }
        return res;
    }

    public String getTitle() {
        return title;
    }

    public Account getAccuntByOwnerLastName (String lastName) {
        for (int i = 0; i < listAccount.size(); i++) {
            Account account = listAccount.get(i);
            if (account.getOwner().getLastName().equals(lastName)) {
                return account;
            }
        }
        return null;
    }

    public void depositAccountByOwnerLastName(String lastName, double amount) {
        Account account = getAccuntByOwnerLastName(lastName);
        if (account != null) {
            account.deposit(amount);
        }
    }

    public void withdrawAccountByOwnerLastName(String lastName, double amount) {
        Account account = getAccuntByOwnerLastName(lastName);
        if (account != null) {
            account.withdraw(amount);
        }
    }

    public  boolean transfer(String lastNameFrom, String lastNameTo, double amount){
        Account accountFrom = getAccuntByOwnerLastName(lastNameFrom);
        Account accountTo = getAccuntByOwnerLastName(lastNameTo);
        if (accountFrom == null || accountTo == null) {
            return false;
        }
        if (accountFrom.withdraw(amount)) {
            accountTo.deposit(amount);
            transactionsList.addTransaction(new Transaction(accountFrom, accountTo, amount));
            return true;
        }
        return false;
    }

    public TransactionsList getTransactionsList() {
        return transactionsList;
    }

    // addNewAccoun - перегруженный метод (overloading)
    public void addNewAccount(Account[] array) {
        for (int i = 0; i < array.length ; i++) {
            addNewAccount(array[i]);
        }
    }

    public void addNewAccount(Account account){
        listAccount.add(account);
    }
}

