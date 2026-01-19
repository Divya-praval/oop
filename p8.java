import java.util.Scanner;

class p8 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");

        System.out.print("Enter a: ");
         double a = sc.nextDouble();
        
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        
        System.out.print("c: ");
         double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {

            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Area of triangle = " + area);
        } else {
            System.out.println("Invalid triangle! Sides cannot form a triangle.");
        }

        sc.close();
    }
}
