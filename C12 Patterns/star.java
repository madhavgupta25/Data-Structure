import java.util.Scanner;
class star {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number to print the star patterns : ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
                System.out.println("");
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
        }
    }
}