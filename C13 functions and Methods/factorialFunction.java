import java.util.Scanner;
class factorialFunction {
    void factorial (int n) {
            int fact = n;
        for (int i = 1; i<n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of "+n +" is "+fact);
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print the factorial : ");
        int num = sc.nextInt();
        factorialFunction obj = new factorialFunction();
        obj.factorial(num);
    }
}