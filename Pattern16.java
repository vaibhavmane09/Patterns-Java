// Pattern  Question
// 1 3 5 7 
// 3 5 7 1
// 5 7 1 3
// 7 1 3 5
// 1 3 5 7


import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 2 * i + 1; j < 2 * n; j += 2) {
                System.out.print(j + " ");
            }
            int a = 1;
            for (int k = 0; k < i; k++) {
                System.out.print(a + " ");
                a += 2;
            }
            System.out.println();
        }
    }
}
