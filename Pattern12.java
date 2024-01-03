// Pattern  Question 
// 4 4 4 4 4 4 4 -------------------- first main part
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4  ------------------ second main part
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // First Main Loop
        int total = (n * 2) - 1;
        for (int i = 0; i < (total / 2) + 1; i++) {
            // Left part
            for (int j = 0; j <= i - 1; j++) {
                System.out.print(n - j + " ");
            }

            // Middle Part
            for (int j = i; j < total - i; j++) {
                System.out.print(n - i + " ");
            }

            // Right Part
            for (int j = n - i + 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Second Main Part
        int x = total / 2;
        for (int i = 0; i < x; i++) {
            // Left Part
            for (int j = n; j >= 3 + i; j--) {
                System.out.print(j + " ");
            }

            // Middle Part
            for (int j = 0; j < 3 + (2 * i); j++) {
                System.out.print(i + 2 + " ");
            }

            // Right Part
            for (int j = x - 2 - i; j >= 0; j--) {
                System.out.print(n - j + " ");
            }
            System.out.println();
        }
    }

}
