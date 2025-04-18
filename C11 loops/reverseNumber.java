import java.util.Scanner;
class reverseNumber {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        // System.out.print("Enter the number of digits in number : ");
        // int n = sc.nextInt();
        int rem = 0;
        System.out.print("Reverse number = ");
        for (int i=0; num>0; i++) {
            rem = num%10;
            System.out.print(rem);
            num/=10;
        }
    }
}