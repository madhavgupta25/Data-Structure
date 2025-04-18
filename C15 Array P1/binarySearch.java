import java.util.Scanner;
public class binarySearch {
    public static void input (int array[],int n) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Element of array in shorted manner : ");
        for (int i = 0; i<=n-1; i++) {
            array[i] = sc.nextInt();
        }
    }
    public static int BS(int array[],int key) {
        int start = 0;
        int end = array.length-1;
        // System.out.println(array.length);
        int mid ;
        while (start <=end) {
            mid = (start+end)/2;
            if(array[mid]==key){
            return mid;
            }
            else if (array[mid]>key){ //left switch
                end=mid-1;
            }
            else if (array[mid]<key){ //right switch
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //size
        System.out.print("Enter the size of an array : "); 
        int n = sc.nextInt();
        int array[] = new int[n];
        input(array,n);
        //key
        System.out.print("Enter the searching element : ");
        int key = sc.nextInt();
        // for input into an array
        //Secarching part
        int SE=BS(array,key);
        if (SE==-1)
        System.out.println("Element is not found");
        else
        System.out.println("Element is found at index number : "+SE);


    }
}