import java.util.*;
class primeNumber{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check weather it is prime or not : ");
        int n = sc.nextInt();
        int i;
        boolean isPrime=true;
        if (n==2) {
            System.out.println (n +" is a prime number ");
        }
        else{
            for (i = 2; i<=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    }
            }
                    if(isPrime == true)
                    System.out.println(n +" is  a prime number");
                    else
                    System.out.println(n +" is not a prime number ");
        }
    }
}