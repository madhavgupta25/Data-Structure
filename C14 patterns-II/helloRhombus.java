import java.util.Scanner;
public class helloRhombus {
    public static void pattern(int n) {
        for (int i=1; i<=n; i++) {
            System.out.println("");
            for (int j = 1; j<=(n-i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=n; j++) {
                if(i==1 || j==1 || i==n || j==n) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of lines in rhombus : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}