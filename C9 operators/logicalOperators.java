import java.util.Scanner;
public class logicalOperators {
    public static void main(String args[]) {
        System.out.print("Enter the 1st number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("enter the 2nd number : ");
        int b = sc.nextInt();
        System.out.println( a<b && a>b);
        System.out.println( a<b || a>b);
        System.out.println( !(a<b  || a>b));
    }
}