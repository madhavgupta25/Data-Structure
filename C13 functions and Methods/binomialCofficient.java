import java.util.Scanner;
class binomialCofficient {               //nCR = n!/r!*(n-r)!
    int BC(int n) {
        int fact = n ;
        for (int i = 1; i<n; i++)
        fact = fact*i;
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        binomialCofficient obj = new binomialCofficient();
        int Fn= obj.BC(n);
        int Fr= obj.BC(r);
        int FnMr= obj.BC(n-r);
        double nCr = Fn / (Fr*FnMr);
        System.out.println(Fn);
        System.out.println(Fr);
        System.out.println(FnMr);
        System.out.println("Binomial Cofficient of "+n +" C " +r +" is "+nCr);
    }
}