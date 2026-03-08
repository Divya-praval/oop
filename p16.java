class LoanCalculator {

   
    void calculateEMI(int principal, int time, float rate) {
        float emi = (principal * rate * time) / 100;
        System.out.println("Home Loan EMI: " + emi);
    }

  
    void calculateEMI(double principal, int time, double rate) {
        double emi = (principal * rate * time) / 100;
        System.out.println("Vehicle Loan EMI: " + emi);
    }

    void calculateEMI(int principal, int time) {
        float rate = 10;
        float emi = (principal * rate * time) / 100;
        System.out.println("Personal Loan EMI: " + emi);
    }
}

public class p16 {
    public static void main(String[] args) {

        LoanCalculator l = new LoanCalculator();

        l.calculateEMI(500000, 5, 7.5f);      
        l.calculateEMI(200000.0, 3, 8.5);     
        l.calculateEMI(100000, 2);             
    }
}