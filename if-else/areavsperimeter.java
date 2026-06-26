import java.util.Scanner;
public class areavsperimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length of the ractangle:");
        int l = sc.nextInt();
        System.out.print("enter breadth of the ractangle:");
        int b = sc.nextInt();
        int a = l*b;
        System.out.print("area is:");
        System.out.println(a);
        int p = 2*(l+b);
        System.out.print("perimeter is:");
        System.out.println(p);
        sc.close();

        if(a>p)
            System.out.print("area is greater");
        

    }
    
}
