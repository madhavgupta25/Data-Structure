// This is BRute force algorithm which is simple method 
// Its time complexity is O(n3) because of 3 nested loop are used in it and they all are going to n and n*n*n=n3
import java.util.Scanner;
public class maxSubArraySum {
    static void subarray(int abc[]) {
        int sum = 0,tp=0;
        int maxSum = Integer.MIN_VALUE;
        for (int i= 0; i<abc.length; i++) {
            int start = i;
            for (int j = i; j<abc.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k<=end; k++) {
                    System.out.print(abc[k] +" ");
                    sum =sum + abc[k];
                }
                System.out.println("");
                System.out.println("sum of this sub array : "+sum);
                System.out.println("");
                tp++;
                if (maxSum<sum) {
                    maxSum = sum;
                }
            }
            System.out.println("");
        }
        System.out.println("total pairs : "+tp);
        System.out.println("Maximum sum of sub array is : "+maxSum);
    }
    public static void main(String args[]) {
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the element of an array : ");
        int abc[] = new int[n];
        for (int i = 0; i<n; i++){
            abc[i] = sc.nextInt();
        }
            subarray(abc);
    }
}