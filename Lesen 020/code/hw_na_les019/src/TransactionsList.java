import java.util.ArrayList;
import java.util.List;

public class TransactionsList {
    private List<Transaction> listTransactions = new ArrayList<>();

    public void addTransaction(Transaction transaction){
        listTransactions.add(transaction);
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < listTransactions.size() ; i++) {
            res +=listTransactions.get(i) + "\n";
        }
        return res;
    }
}
