// Pattern  Question
// ....1
// ...232
// ..34543
// .4567654
// 567898765

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            //  dots(.)
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(".");
            }
            // number
            for (int k = i + 1; k <= (2 * i) + 1; k++) {
                System.out.print(k);
            }
            // numbers decresing 
            for (int l = 2 * i; l >= i + 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
