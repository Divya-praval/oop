
/*Develop a Java application that calculates a person's Body Mass Index (BMI). The program should ask the user for their weight in pounds and height in inches. Convert these values to kilograms and meters respectively (1 pound = 0.45359237 kg, 1 inch = 0.0254 meters) and then calculate BMI (weight in kg / (height in meters) ^2). Display the calculated BMI.*/





import java.util.Scanner;

public class practical4 {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

double weight;
System.out.println("Enter the weight in pounds: ");
weight = sc.nextDouble();

double height;
System.out.println("Enter the height in inches: ");
height = sc.nextDouble();
 
double wkg = 0.45359237* weight;
System.out.println("weight in kilogaram is :  " +wkg);

double hm =0.0254*(height);
System.out.println("height in meter is : " +hm);

double BMI = ((wkg/ hm)*hm );
System.out.println("BMI : " +BMI);


}
}