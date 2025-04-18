import java.util.Scanner;
public class butterflyPattern {
    public static void pattern(int n) {
        //for 1st half
        for (int i = 1; i<=n; i++){
            System.out.println("");//for next line
            //for stars
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            //for spaces
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            //for stars
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
        }
        //for 2nd half
        for (int i = n; i>=1; i--){
            System.out.println("");
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print how many lines in butterfly pattern : ");
        int n = sc.nextInt();
        pattern(n);
    }
}