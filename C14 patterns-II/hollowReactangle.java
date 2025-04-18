import java.util.*;
public class hollowReactangle {
    public static void H_R(int r, int c) {
        for (int i = 1; i <= r; i++) {
            System.out.println("");
            for (int j = 1; j <= c; j++) {
                if (i==1 || i==r || j==1 || j==c) {
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the total number of column : ");
        int c = sc.nextInt();
        H_R(r,c);
    }
}