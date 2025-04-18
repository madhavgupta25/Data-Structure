import java.util.Scanner;
public class linearSearch {
    void input(int array[] , int n) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the element in an array : ");
        for (int i = 0; i<=n-1; i++) {
            array[i] = sc.nextInt();
        }

    }
    int LS(int array[],int n,int key) {
        for(int i = 0; i<=n-1; i++) {
            if (array[i]==key) {
                // System.out.println("Element is found at index number " +i);
                return i;
            }
        }
        // System.out.println("Element not found in given array.");
        return -1;
            
    }
    public static void main (String args[]) {
        System.out.print("Enter the size od array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int [n];
        linearSearch obj = new linearSearch();
        obj.input(array,n);
        System.out.print("Enter the element to search into an array : ");
        int key = sc.nextInt();
        int z=obj.LS(array,n,key);
        if (z==-1) 
        System.out.println("Element not found");
        else 
        System.out.println("Element is found at index number " +z);

    }
}