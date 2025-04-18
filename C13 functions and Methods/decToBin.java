import java.util.*;
class decToBin {
    public static void DToB(int dec) {
        int pow = 0;
        int n = dec;
        int rem ;
        int bin=0;
        while (dec>0) {
            rem = dec%2;
            bin = bin + (rem *(int) Math.pow(10, pow ));
            pow++;
            dec = dec/2;
        }
            System.out.println("binary number of "+n +" is = "+bin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number to convert it into a binary number : ");
        int bin = sc.nextInt();
        DToB(bin);
        
    }
}