import java.util.Scanner;
class Array {
    public static void input(int numbers[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<=6; i++) {
            System.out.print("Enter the number "+(i+1) +" element of into an array : ");
            numbers[i] = sc.nextInt();
        }
    }
    public static void output(int numbers[]) {
        for (int i = 0 ; i<=6; i++) {
            System.out.print(numbers[i] +" ");
        }
    }
    public static void main (String args[]) {
        int numbers[] = new int[7];
        input(numbers);
        output(numbers);
    }
}