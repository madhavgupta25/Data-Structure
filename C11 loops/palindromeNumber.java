import java.util.Scanner;
class palindromeNumber {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int n = num;
        // System.out.print("Enter the number of digits in number : ");
        // int n = sc.nextInt();
        int rem;
        int re = 0;
        System.out.print("Reverse number = ");
        for (int i=0; num>0; i++) {
            rem = num%10;
            //System.out.print(rem);
            num/=10;
            re = (re*10)+rem;
        }
        System.out.println(re);
        if (n==re) {
            System.out.println("Given number is armstrong number");
        }
        else {
            System.out.println("Given number is not armstrong number");
        }
    }
}