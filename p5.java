import java.util.Scanner;

 class p5{
 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


System.out.println("Enter the value of amount");
 int amount = sc.nextInt();

 System.out.println("the amount is : "  +amount);

int notes[] = {100,50,10,5,2,1};

System.out.println("notes : ");

for(int i = 0 ;i<notes.length; i++)
  {
     int count = amount / notes[i];
     if(count > 0 ){
         //System.out.println( notes[i]":"  +count );
         System.out.println(notes[i] + " : " + count);
         amount = amount % notes[i];
       }
   }

   sc.close();

}
}