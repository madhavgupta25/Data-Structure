
import java.util.Scanner;

class instaPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of n : ");
        int n = sc.nextInt();
        int start =1;
        for(int i = 1; i<=n; i++){
            int val = start;
            int dec = n-1;
            for (int j=1; j<=i; j++){
                System.out.print( val +" ");
                val =val-(dec--);
            }
            System.out.println();
            start = start+(n-i);
        }
    }
}