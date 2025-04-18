import java.util.Scanner;
class incomeTaxCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Income : ");
        double income = sc.nextFloat();
        double tax;
        if (income < 500000) {
            System.out.println("your income is tax free in the India");
        } 
        else if( 500000 < income && income <= 1000000 ) {
            tax = income * 0.2;
            System.out.println("the 20% tax will be paid by you which is approx : "+tax);
        }
        else if( income > 1000000 ) {
            tax = income*0.3;
            System.out.println("the 30% tax will be paid by you which is approx : "+tax);
        }
    }
}