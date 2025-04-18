import java.util.Scanner;
class largestNumber{
    public static void main(String args []) {
        System.out.print("enter the 1st no. : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("enter the 2nd no. : ");
        int b = sc.nextInt();
        if (a>b) {
            System.out.println("The largest number is : " +a);
        }
        else {
            System.out.println("The largest number is : "+b);
        }

    }
}