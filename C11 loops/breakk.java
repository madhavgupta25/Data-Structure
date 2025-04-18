import java.util.Scanner;
class breakk {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        do { 
            System.out.print("Enter any number : ");
            n = sc.nextInt();
            if(n%10==0) {
                break;
            }
            System.out.println(n);
        } while (true);
        
    }
}