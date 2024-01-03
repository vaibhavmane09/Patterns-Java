// Pattern  Question 

// 5 5 5 5 5 
// 4 4 4 4   
// 3 3 3     
// 2 2       
// 1


import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(n - i + " ");
            }
            System.out.println();
        }
    }
}
