import java.util.*;
class binToDecimal {
    public static void BinarytoDecimal(int n) {
        int myNum=n;
        int LD;
        int DecNum = 0;
        int pow = 0;
        while (n>0) {
            LD = n%10;
            DecNum=(int) (DecNum + (LD*Math.pow(2, pow)));
            pow++;
            n =n/10;
        }
        System.out.println("Decimal of "+myNum +" = "+DecNum);
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the binary number to convert it into decimal number : ");
     int bNum = sc.nextInt();
    BinarytoDecimal(bNum);
    }

}