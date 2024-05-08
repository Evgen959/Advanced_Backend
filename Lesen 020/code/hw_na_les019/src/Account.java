public class Account {
        private String iban;
        private double balance;
        private Person owner; //HAS A

        public Account(String iban, Person owner) {
            this.iban = iban;
            this.owner = owner;
            balance = 0;
        }

        @Override
        public String toString() {
            return iban + " " + owner + "  [" + balance + "]";
        }

        public void deposit(double amount){
            balance+=amount;
        }

        public boolean withdraw(double amount){
            if (amount <= balance) {
                balance -= amount;
                return true;
            }
            return false;
        }

        public double getBalance() {
            return balance;
        }

        public Person getOwner() {
            return owner;
        }
}

