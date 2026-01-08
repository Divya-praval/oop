import java.util.Scanner;

public class Equation{
  public static void main(String[] args )
{

    Scanner sc = new Scanner(System.in);

    double a ;
    double b ;
    double c ;
    double d ; 
    double e ;
    double f ;
    double x ;
    double y ;
    double D ;
    double Dx ;
    double Dy ;

    System.out.println("Enter the value of a  :");
    a = sc.nextDouble();
    System.out.println("Enter the value of b  :");
    b = sc.nextDouble();
    System.out.println("Enter the value of c :");
    c = sc.nextDouble();
    System.out.println("Enter the value of d  :");
    d = sc.nextDouble();
    System.out.println("Enter the value of e :");
    e = sc.nextDouble();
    System.out.println("Enter the value of f :");
    f = sc.nextDouble();


     D= a*d - b*c;
    Dx= e*d - b*f;
    Dy= a*f - c*e; 
    x=Dx/D;
    y=Dy/D;

System.out.println("value of x is :" + x);
System.out.println("value of y is :" + y);

}
}