import java.util.Scanner;
class charcterPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number to print the half pyramid patterns : ");
        int n = sc.nextInt();
        char ch ='A';
        for (int i=1; i<=n; i++) {
                System.out.println("");
            for (int j = 1; j<=i; j++){
                System.out.print(" "+ch);
                ch++;
            }
        }
    }
}