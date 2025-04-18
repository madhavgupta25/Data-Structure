import java.util.Scanner;
public class relationalOperator {
    public static void main(String args[]) {
        System.out.print("enter the value of a : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("enter the value of b: ");
        int b = sc.nextInt();
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);
    }
}