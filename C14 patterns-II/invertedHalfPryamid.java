import java.util.Scanner; 
class invertedHalfPryamid{
    public static void pattern(int n) {
        for (int i = 1; i<= n; i++) {          //for lines
        System.out.println(""); // for next line
        // for (int j = 1; j<= n-i; j++){
        //     System.out.print("  ");
        // }
        for (int j = 1; j<= (n-i)+1; j++){
            System.out.print(j+" ");
        }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for print inverted half triangle : ");
        int n = sc.nextInt();
        pattern(n);
    }
}