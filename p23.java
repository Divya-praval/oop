
class BankAccount{
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accno , String n, double b){
        accountNumber = accno;
        accountHolderName = n;
        balance = b;
    }

    void deposit(double amount){
      balance = balance + amount;
      System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingAccount extends BankAccount{

    double calculateInterest(double rate){
      return (balance * rate) / 100;
    }
}

class FixedDepositAccount extends BankAccount{

    double maturityAmount(int years, double rate) {
        return balance + (balance * rate * years) / 100;
    }
}

public class p23 {

    public static void main(String[] args) {

        SavingAccount s1 = new SavingAccount();
        s1.openAccount(101, "Divya", 5000);
        s1.deposit(1000);
        s1.withdraw(500);
        s1.checkBalance();
        System.out.println("Saving Interest: " + s1.calculateInterest(5));

        System.out.println();

        FixedDepositAccount f1 = new FixedDepositAccount();
        f1.openAccount(102, "Parth", 10000);
        f1.deposit(2000);
        f1.checkBalance();
        System.out.println("FD Maturity Amount: " + f1.maturityAmount(3, 6));
    }
}