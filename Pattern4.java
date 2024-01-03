// Question - Code for Alphabets Pattern
// A
// B B
// C C C 
// D D D D 


import java.util.*;

public class Pattern4 {
    public static void main(String[] args) {
        System.out.println("Enter the Numbmer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + i) + " ");
            }
            System.out.println();
        }
    }
}
