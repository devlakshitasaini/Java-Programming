import java.util.Scanner;
public class printthesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a :");
        double a = sc.nextDouble();
        System.out.print("b :");
        double b = sc.nextDouble();
        System.out.print("c :");
        double c = sc.nextDouble(); 
        
        double sum = a+b+c;
        System.out.print("sum of the numbers: ");
        System.out.print(sum);
        sc.close();

        
    }
    
}
