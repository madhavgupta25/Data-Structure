
import java.util.Scanner;

public class BS{

    void input(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sorted array plz : ");
        for (int i = 0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
    }

    int BSearch(int arr[], int key){
        int start = 0, end = arr.length-1,mid;
        while (start <= end){
            mid = (start+end)/2;
            // comparisons
            if (arr[mid] == key)
            return mid; 
            else if(arr[mid] > key)
            end = mid-1; // 1st half
            else if (arr[mid] < key)
            start = mid+1; //2nd half
        }
        return -1;
    }
    public static void main(String args[]) {
        System.out.print("Enter the size of Array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        BS obj = new BS();
        obj.input(arr);
        System.out.print("Enter the number which you have to search : ");
        int key = sc.nextInt();
        int op = obj.BSearch(arr, key);
        if (op != -1)
        System.out.println(key +" is found at index number  "+op);
        else
        System.out.println("Opps !! "+key +" not found");
        
    }
}