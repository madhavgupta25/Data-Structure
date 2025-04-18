import java.util.Scanner;
public class diamond {
    static void pattern(int n) {
        //for first part
        for (int i =1; i<=n; i++) {
            System.out.println("");
            for(int j = 1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j<=i+(i-1); j++) {
                System.out.print("* ");
            }
        }
        //for Second part
        for (int i =n; i>=1; i--) {
            System.out.println("");
            for(int j = 1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j<=i+(i-1); j++) {
                System.out.print("* ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of lines to print a diamond pattern : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}