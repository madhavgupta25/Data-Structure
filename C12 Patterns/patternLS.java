import java.util.*;
class patternLS {
    public static void pyramid(int n) {
        for (int i =1; i<=n; i++) {
            System.out.println("");
            for (int j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many lines that you print in your pyramid : ");
        int n = sc.nextInt();
        pyramid(n);

    }
}