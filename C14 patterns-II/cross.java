public class cross {
    public static void pattern(int n)  {
        for (int i = 1; i <= n; i++) {
            System.out.println("");
            for (int j = 1; j<=n; j++) {
                if (i==j || j==(n-i+1))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
        }
    }
    public static void main(String args[]) {
        pattern(7);
    }
}
// public class cross {
//     public static void pattern(int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 // Print '*' at diagonal positions to form a cross
//                 if (i == j || j == (n - i + 1)) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  "); // Print spaces for alignment
//                 }
//             }
//             System.out.println(); // Move to the next line
//         }
//     }

//     public static void main(String args[]) {
//         pattern(7); // Call the function with size 7
//     }
// }
