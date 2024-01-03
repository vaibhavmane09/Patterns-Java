//Pattern  Question 
// A
// B C 
// C D E 
// D E F G 
// E F G H I

import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
        System.out.println("Enter the Numbmer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=i; j<=(i*2); j++){
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
        }
        
    }
}
