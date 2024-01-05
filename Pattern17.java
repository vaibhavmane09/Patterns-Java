// Pattern Question

// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //Upper part
        for(int i=1; i<=n; i++){
            //First part *
            for(int j=1; j<=i; j++){
                System.err.print("*");
            }
            // spaces
            int space=2*(n-i);
            for(int j=1; j<=space; j++){
                System.err.print(" ");
            }
            // last part *
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower Part
        for(int i=n; i>=1; i--){
            //First part *
            for(int j=1; j<=i; j++){
                System.err.print("*");
            }
            // spaces
            int space=2*(n-i);
            for(int j=1; j<=space; j++){
                System.err.print(" ");
            }
            // last part *
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
