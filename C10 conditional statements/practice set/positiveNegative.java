import java.util.Scanner;
class positiveNegative {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check it is positive or negative : ");
        int num = sc.nextInt();
        if (num > 0 )
        System.out.println("Given number is positive");
        else System.out.println("Given number is negative");
    }
}