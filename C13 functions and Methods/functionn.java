import java.util.Scanner;
public class functionn {
    public static void helloWorld() {
        System.out.println("Hello World");
    }
    public static void sum(int num1 , int num2) { // parameter or formal parameters
        int s = num1+num2;
        System.out.println("sum is : "+s);
    }
    public static void main (String args[]) {
        helloWorld();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b); // arguments or actual parameters
    }
}