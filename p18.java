class BankAccount{

    String accountholdername;
    double balance;
    static double interestrate = 10;

    BankAccount(String n , double b){
        accountholdername = n;
        balance = b;
    }

    double calculate(){
    double interest = (balance * interestrate)/100;
    return interest;

    }

    void displaydata(){
        double interest = calculate();
        System.out.println("interest :" +interest);
        System.out.println("name :" +accountholdername);
        System.out.println("balance :" +balance);
    }

    static void updateintrestrate(double newinterest){
        interestrate = newinterest;
          System.out.println(" new interest :" +newinterest +"%");
    }
}

public class p18{
    public static void main(String args[]){
        BankAccount a1 = new BankAccount("divya" , 1000);
        BankAccount a2 = new BankAccount("parth" , 2000);

        a1.displaydata();
         a2.displaydata();

         BankAccount.updateintrestrate(9);
         a1.displaydata();
         a2.displaydata();
    }
}