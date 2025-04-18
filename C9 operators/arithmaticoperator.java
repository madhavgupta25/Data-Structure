import java.util.Scanner;
public class arithmaticoperator {
    public static void main(String args[]) {
        System.out.print("enter the number a & b : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum of a & b is : " +sum);
        int difference = a-b;
        System.out.println("substraction of a & b is : " +difference);
        int multiply = a*b;
        System.out.println("multiplication of a & b is : " +multiply);
        int qutiont = a/b;
        System.out.println("division of a & b is : " +qutiont);
        int remiander = a%b;
        System.out.println("remiander of a & b is : " +remiander);

        System.out.println ("preinctiment of a is : "+ ++a);
        System.out.println ("postinctiment of a is : "+ a++);
        System.out.println ("predecriment of a is : "+ --a);
        System.out.println ("postdectiment of a is : "+ a--);

    }
}
