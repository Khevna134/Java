public class pr10 {
    String account_holder_name;
    double balance;
    static double interest_rate;

    public pr10(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    static void setInterestRate(double rate) {
        interest_rate = rate;
    }

    double calculateInterest() {
        return balance * interest_rate / 100;
    }

    void display() {
        System.out.println("Name: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
    }

    public static void main(String[] args) {
        pr10.setInterestRate(5);

        pr10 acc1 = new pr10("Alice", 10000);
        pr10 acc2 = new pr10("Bob", 20000);

        acc1.display();
        System.out.println();
        acc2.display();
    }
}
//output
//Name: Alice
//Balance: 10000.0
//Interest Earned: 500.0

//Name: Bob
//Balance: 20000.0
//Interest Earned: 1000.0
