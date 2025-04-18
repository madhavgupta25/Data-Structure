import java.util.Scanner;
class calculatorSwitch {
    public static void main(String args[]) {
        System.out.print("enter the 1st number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("enter the 2nd number : ");
        int b = sc.nextInt();
        System.out.print("Enter the operation : ");
        char operation = sc.next().charAt(0);
        switch (operation) {
            case '+' : 
                System.out.println("the sum of a & b is : "+ (a+b));
                break;
            case '-' :
                System.out.println("The subtraction of a & b is : "+ (a-b));
                break;
            case '*' : 
                System.out.println("the multiplication of a & b is : "+ (a*b));
                break;
            case '/' :
                System.out.println("The division of a & b is : "+ (a/b));
                break;
            case '%' :
                System.out.println("The modulo of a & b is : "+ (a%b));     
        }
    }
}