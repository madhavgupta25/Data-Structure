import java.util.Scanner;
public class invertedPyramid {
    public static void pattern(int n) {
        //outern loop for switch line
        for (int i = 1; i<=n; i++) {
            System.out.println(" "); // for next line
            //for spaces
            for (int j = 1; j<=n-i; j++) {
                System.out.print("  ");
            }
            //for stars
            for (int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number to print hollow pryamid : ");
        int n = sc.nextInt();
        pattern(n);
    }
} 