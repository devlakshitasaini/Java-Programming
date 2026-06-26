import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius: ");
        double r = sc.nextDouble();
        double a = 3.14*r*r;
        System.out.print("area is: ");
        System.out.print(a); 
        sc.close();
    }
    
}

