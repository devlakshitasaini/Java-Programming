import java.util.Scanner;
public class greatestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a numbera a:");
        int a = sc.nextInt();
        System.out.print("enter a number b:");
        int b = sc.nextInt();
        System.out.print("enter a number c:");
        int c = sc.nextInt();   

    if(a>=b && a>=c)
        System.out.print("a is greater");
    else if(b>=a && b>=c)
        System.out.print("b is greater");
    else
        System.out.print("c is greater");
sc.close();

    }
    
}
