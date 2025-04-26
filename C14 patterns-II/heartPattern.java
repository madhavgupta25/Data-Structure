import java.util.Scanner; 
class heartPattern{
    public static void h(int n){
        for(int i=1; i<=((n/2)-1); i++) {
            System.out.println("");
            for(int j=i; j<=((n/2)); j++ ) {
                System.out.print("  ");
            }
            for(int j=1; j<=(i*((n/2)-1)); j++ ) {
                System.out.print("* ");
            }
            for(int j=i; j<=(n-(i+1)); j++ ) {
                System.out.print("  ");
            }
            for(int j=1; j<=(i*((n/2)-1)); j++ ) {
                System.out.print("* ");
            }
        }
    }
    public static void pattern(int n) {
        for (int i = 1; i<= n; i++) {          //for lines
        System.out.println(""); // for next line
        for(int j = 1; j<=i; j++){
                System.out.print("  ");
            }
        for (int j = i; j<= (2*n-i); j++){
            System.out.print("* ");
        }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for print inverted half triangle : ");
        int n = sc.nextInt();
        h(n);
        pattern(n);
    }
}