import java.util.Scanner;
class invertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number to print the half pyramid patterns : ");
        int n = sc.nextInt();
        for (int i=0; i<=n-1; i++) {
                System.out.println("");
            for (int j = 1; j<=n-i; j++){
                System.out.print(" "+j);
            }
        }
    }
}