package function;
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int l = sc.nextInt();
        System.out.print("enter a number:");
        int m= sc.nextInt();
        System.out.println(Math.pow(l,m));
        sc.close();
    }
}
