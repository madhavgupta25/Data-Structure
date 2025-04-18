import java.util.Scanner;
public class multiplyFunction {
    void multiply(int num1, int num2) {
        int m = num1*num2;
        System.out.println("prouduct is : "+m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        multiplyFunction obj = new multiplyFunction();
        obj.multiply(a, b);
    }
}