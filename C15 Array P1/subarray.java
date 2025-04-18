
import java.util.Scanner;

class subarray {
    static void subarrays(int abc[]) {
        int ts=0,sum=0;
        for (int i=0; i<abc.length; i++) {
            int start = i;
            for (int j = i; j<abc.length; j++ ) {
                int end = j;
                sum =0;
                for (int k = start; k<=end; k++) { // start with i and end with j
                    System.out.print(+abc[k] +" ");
                    sum=sum+abc[k];
                }
                System.out.print(sum);
                ts++;
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("total sub-arrays : "+ts);
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int abc[] = new int [n];
        System.out.print("Enter the elements of your array to print sub arrays : ");
        for (int i = 0; i<=n-1; i++) {
            abc[i] = sc.nextInt();
        }
        subarrays(abc);
    }
}