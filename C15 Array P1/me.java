
import java.util.Scanner;

class me{
    public void input(int arr[],int n){
        System.out.print("enter the element in array : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
    }
    int largestNumber(int arr[]){
        int max=arr[0];
        int min=arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i])
            max=arr[i];
            if (min > arr[i])
            min = arr[i];
        }
        System.out.println("Smallest number is : "+min);
        return max;
    }
    public static void main(String[] args) {
        //int max=Integer.MIN_VALUE;
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        me obj = new me();
        obj.input(arr,n);
        
        System.out.println("Largest number is : "+obj.largestNumber(arr));

    }
}