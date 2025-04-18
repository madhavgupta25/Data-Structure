import java.util.Scanner;
class ternaryOperator {
    public static void main (String args[]) {
        System.out.print("Enter the marks : ");
        Scanner sc = new Scanner (System.in);
        int marks = sc.nextInt();
        // ternary operator
        String result = marks>=33?"pass":"fail";
        System.out.println("student is " +result);
      }
}