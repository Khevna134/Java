class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double calculateInterest(double rate) {
        return balance * rate / 100;
    }
}

class FixedDepositAccount extends BankAccount {
    double maturityAmount(double rate, int years) {
        return balance + (balance * rate * years / 100);
    }
}

public class pr14 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.openAccount(101, "Alice", 10000);
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.checkBalance();
        System.out.println("Saving Interest: " + sa.calculateInterest(5));

        System.out.println();

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount(102, "Bob", 20000);
        fd.checkBalance();
        System.out.println("Maturity Amount: " + fd.maturityAmount(6, 2));
    }
}
//output
//Balance: 10500.0
//Saving Interest: 525.0

//Balance: 20000.0
//Maturity Amount: 22400.0
