import java.util.Scanner;
class rhombus {
    public static void rhombus(int n) {
        for (int i=1; i<=n; i++) {
            System.out.println("");
            for(int j = 1; j<=(n-i); j++){
                System.out.print("  ");
            }
            for (int j=1; j<=n; j++) {
                System.out.print("* ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the mumber of lines in rhombus : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rhombus(n);
    }
}