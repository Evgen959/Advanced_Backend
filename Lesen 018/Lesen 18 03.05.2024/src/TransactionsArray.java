public class TransactionsArray {
    private int capacity = 6;
    private int size;
    private Transaction[] transactions = new Transaction[capacity];
    
    public void addTransaction(Transaction transaction){
        if (size >= transactions.length) { // проверяем сколько пустых ячеек в массиве
            enlarge();
        }
        transactions[size++] = transaction;
    }

    private void enlarge() {
        Transaction[] temp = new Transaction[transactions.length*2]; // создаем новый масив
        for (int i = 0; i < transactions.length; i++) {   // переписываем все элементы массва в новый
            temp[i] = transactions[i];//  переадресовываемся к новаму массиву
        }
        transactions = temp;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < size ; i++) {
            res +=transactions[i] + "\n";
        }
        return res;
    }
    
    
}
