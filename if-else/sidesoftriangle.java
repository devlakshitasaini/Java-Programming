import java.util.Scanner;
public class sidesoftriangle { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the 1st side:");
        int a = sc.nextInt();
        System.out.print("enter the 2nd side:");
        int b = sc.nextInt();
        System.out.print("enter the 3rd side:");
        int c = sc.nextInt();
        if(a+b>c && a+c>b && b+c>a)
            System.out.print("valid triangle");
        else
            System.out.print("invalid triangle");
        sc.close();

    }
    
}
