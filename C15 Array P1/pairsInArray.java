import java.util.Scanner;
class pairsInArray {
    static void pairsInArray(int arr[]) {
        int tp=0;
        for (int i = 0; i<arr.length; i++){
            int current = arr[i];
            for(int j=i+1; j<arr.length; j++) {
                System.out.print("("+current+ "," +arr[j]+") ");
                tp++;
            }
            System.out.println("");
        }
            System.out.println(tp);
    }
    
    
    
    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the elements of array : ");
        int arr[]=new int [n];
        for (int i = 0; i<=n-1; i++) {
            arr[i]= sc.nextInt();
        }
        pairsInArray(arr);
    }

}