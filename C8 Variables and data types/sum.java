import java.util.Scanner;
class sum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of a & b"+sum);
        int product = a*b;
        System.out.println("Product of a & b"+product);
    }
}