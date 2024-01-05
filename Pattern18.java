// Pattern 

//     *****
//    *****
//   *****
//  *****
// *****

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            // spaces = n-i
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // stars 
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
