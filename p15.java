class BillGenerator{

void generateBill(int itemTotal){
System.out.println("For regular customer");
System.out.println(+itemTotal);
}

void generateBill(int itemTotal,int discount){
System.out.println("Forprivileged customer");
System.out.println("discount  :"  +discount);
int finalbill = itemTotal - discount;
System.out.println("finalbill is :"  +finalbill);
}

void generateBill(int itemTotal , double discountpercentage){
System.out.println("For festive offer :");
double discount = (itemTotal *discountpercentage )/100;
System.out.println("discount: " +discount);
double finalbill = itemTotal - discount;
System.out.println("finalbill is :"  +finalbill);
    }

}

public class p15 {
    public static void main(String[] args) {

        BillGenerator bill = new BillGenerator();

        bill.generateBill(5000);       
        bill.generateBill(5000, 500);   
        bill.generateBill(5000, 10.0);  
    }
}