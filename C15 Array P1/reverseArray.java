import java.util.Scanner;
class reverseArray{
    public static void RA(int abc[],int n) {
        System.out.print("your reverse array is : ");
        for (int i=n-1;i>=0;i--) {
            System.out.print(abc[i]+" ");
        }
    }
    public static void reverse(int abc[],int n) {
        int first = 0 , last = abc.length-1;
        while(first < last) {
            int temp = abc[last];
            abc[last]=abc[first];
            abc[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]) {
        System.out.print("Enter the size of an array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the Element in array : ");
        int abc[] = new int[n];
        for (int i=0; i<=n-1; i++) {
            abc[i] = sc.nextInt();
        }
        // RA(abc,n);
        reverse(abc,n);
        System.out.print("your reverse array is : ");
        for (int i=0;i<=n-1;i++) {
            System.out.print(abc[i]+" ");
        }

    }
}