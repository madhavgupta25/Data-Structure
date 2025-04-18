import java.util.Scanner;
class sumNatural {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        int sum = 0,i=0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("the sum of "+n+" natural number is : "+sum);

    }
}