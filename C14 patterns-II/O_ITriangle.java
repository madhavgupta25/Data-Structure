import java.util.*;
public class O_ITriangle{
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("");
            for (int j=0; j<i; j++) {
                // if((i+j)%2==0)
                // System.out.print("0"+" ");
                // // else if(i%2){
                // // System.out.print("1"+" ");}
                // else
                
                System.out.print((i+j)%2);
            }
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of triangle to print line : ");
        int n = sc.nextInt();
        pattern(n);

    }
}