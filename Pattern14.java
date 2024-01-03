// Pattern Question
// 1=1
// 1+2=3
// 1+2+3=6
// 1+2+3+4=10

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n - 1; i++) {

            int sum = 0;
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
                if (j < i + 1) {
                    System.out.print("+");
                }
                sum += j;
            }
            System.out.print("=");
            System.out.print(sum);
            System.out.println();
        }
    }
}
