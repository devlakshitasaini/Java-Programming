package PatternPrinting;

import java.util.Scanner;

public class alphatriangl2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print((char)(i+96)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
