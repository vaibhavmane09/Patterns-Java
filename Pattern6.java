// Pattern  Question 
// D
// C D
// B C D
// A B C D

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        System.out.println("Enter the Numbmer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=i; j>=0; j--){
                System.out.print((char)(65+n-j-1)+" ");
            }
            System.out.println();
        }
    }
}
