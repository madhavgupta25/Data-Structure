import java.util.Scanner;
public class avg {
    public static void main (String args[]) {
        System.out.println("enter the three numbers for calculate average");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = (a+b+c)/3;
        System.out.println("average of 3 numbers "+avg);
    }
}