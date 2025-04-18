import java.util.*;
// public class primeFunction {
//     boolean isPrime(int n) {
//         // boolean isPrime = true;
//             if (n==2) {
//                 return true;
//             }
//             else {
//                 for (int i=2; i<=n-1; i++) {
//                     if (n%i==0) {
//                         return false;
//                 }
//             }
//          }
//          return true;
//     }
public class primeFunction {
    boolean isPrime(int n) {
        // boolean isPrime = true;
            if (n==2) {
                return true;
            }
            else {
                for (int i=2; i<=Math.sqrt(n); i++) {
                    if (n%i==0) {
                        return false;
                }
            }
         }
         return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        primeFunction obj = new primeFunction();
        System.out.println(obj.isPrime(a));
    }
}