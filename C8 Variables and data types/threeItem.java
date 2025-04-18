import java.util.Scanner;
public class threeItem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of your pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the price of your pen : ");
        float pen = sc.nextFloat();
        System.out.print("Enter the price of your eraser : ");
        float eraser = sc.nextFloat();   
        float bill = (pencil+pen+eraser);
        float GST = bill*18/100;
            bill = (bill)+(GST);
        System.out.println("Total amount of your bill inc. GST is : "+bill);
    }
}