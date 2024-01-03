// Pattern Question 
// ..*  
// .*** 
// *****
// .***
// ..*


import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = (n / 2) + 1;

        for (int i = 0; i < x; i++) {
            for (int j = 1; j <= x - i - 1; j++) {
                System.out.print(".");
            }
            for (int k = 1; k <= (2 * i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= (n - x); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(".");
            }
            for (int k = 1; k <= (n - (2 * i)); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
