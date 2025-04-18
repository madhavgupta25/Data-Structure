import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the the number to show their Factorial : ");
        int n = sc.nextInt();
        int f=n;
        for (int i=1; i<n; i++){
            f=f*i;
        }
        System.out.println("The Factorial of "+n +" is : " +f);
    }

    
}