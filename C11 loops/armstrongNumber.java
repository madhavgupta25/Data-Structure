
import java.util.Scanner;

class armstrongNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number to check weather the number is armstrong or not :");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int num=n;
        int digit=0;
        while (n>0) {
            digit++;
            n = n%10;
        }
        int sum = 0;
        while(n>0){
            int rem =n%10;
            int prod = 1;
            for(int i =0; i<=digit; i++){
                prod = prod*rem;
            }
            sum = sum + prod;
            n = n/10;
        }
        
        if(sum == num){
            System.out.println("Given number is armstrong number");
        }
        else{
            System.out.println("given number is not armstrong number");
        }

    }
}