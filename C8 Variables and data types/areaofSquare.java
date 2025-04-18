import java.util.Scanner;
class areaofSquare {
    public static void main (String args[]) {
        System.out.print("enter the side of square :");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int area = s*s;
        System.out.println("Area of Square is : "+area );
    }
}