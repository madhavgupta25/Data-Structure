import java.util.Scanner;
public class largestInArray {
    void input(int arr[],int n) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element into an array : ");
        for (int i = 0 ; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
    }
    int largestElement(int arr[],int n) {
        int LE=Integer.MIN_VALUE; // shows -infinity
        int SE = Integer.MAX_VALUE; //shows biggest value of integer
        for (int i = 0; i <= n-1; i++) {
            if(LE < arr[i]){
                LE = arr[i];
            }
            if(SE > arr[i]){
                SE = arr[i];
            }
        }
        System.out.println("Largest element in given array = " +SE);
        return LE;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[]=new int [n];
        largestInArray obj =new largestInArray();
        obj.input(arr, n);
        int largestElement=obj.largestElement(arr, n);
        System.out.println("Largest element in given array = " +largestElement);
    }
}