import java.util.Scanner;
class largestOfThreeNumber {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd number : ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a +" , 1st number is the largest number");
        }
        else if (b > c && b > a) {
            System.out.println(b +" , 2nd number is the largest number");
        }
        if (c > a && c > b) {
            System.out.println(c +" , 3rd number is the largest number");
        }
    }
}