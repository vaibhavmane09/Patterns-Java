// Pattern Question 
//     1
//    12
//   123
//  1234
// 12345

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        System.out.println("Enter the Numbmer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
