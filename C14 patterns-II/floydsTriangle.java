import java.util.Scanner;
class floydsTriangle{
    public static void pattern (int n){
        int k = 1;
        for (int i = 1 ; i<=n; i++){
            System.out.println("");
            for (int j = 1; j<=i; j++){
                System.out.print(k+" ");
                k++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print the floyd's Triangle pattern : ");
        int n = sc.nextInt();
        pattern(n);
    }
}