import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int i;

        System.out.print("Enter a 5-digit number: ");
        int num = sc.nextInt();

        // store digits in array
        for (i = 4; i >= 0; i--) {
            a[i] = num % 10;
            num = num / 10;
        }

        // add 1 to each digit
        for (i = 0; i < 5; i++) {
            a[i] = (a[i] + 1) % 10;
        }

        System.out.print("Result: ");
        for (i = 0; i < 5; i++) {
            System.out.print(a[i]);
        }

        sc.close();
    }
}
