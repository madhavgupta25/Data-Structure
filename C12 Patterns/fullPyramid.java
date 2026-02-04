import java.util.Scanner;
class fullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number to print the full pyramid patterns : ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
                System.out.println("");
                for (int j = 1; j<=n-i; j++){
                System.out.print("  ");
                }
                for (int j = 1; j<=i; j++){
                System.out.print("* ");
                }
            for (int j = 1; j<=i-1; j++){
                // if(i==1){
                //     continue;
                // }
                System.out.print("* ");
            }
        }
    }
}