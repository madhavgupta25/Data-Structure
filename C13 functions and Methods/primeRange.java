import java.util.*;
public class primeRange {
    public static boolean  PR(int n) {
        if (n==2) {
            return true;
        }
        else {
            for (int i=2; i<= Math.sqrt(n);i++) {
                if (n%i==0) 
                    return false;
            }
        }
        return true;
    }
    public static void print(int n) {
        for (int i = 2; i<=n-1; i++){
            boolean isPrime = PR(i);
            if (isPrime == true) {
                System.out.print(" "+i);
            }
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for show Prime number range : ");
        int n = sc.nextInt();
        print(n);

    }
}