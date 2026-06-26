import java.util.Scanner;
public class xyquadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter point x:");
        int x = sc.nextInt();
        System.out.print("enter point y:");
        int y = sc.nextInt();
        
        
        if(x>0 && y>0)
            System.out.print("points lies in 1st quadrant");
        else if(x<0 && y>0)
            System.out.print("points lies in 2nd quadrant");
        else if(x<0 && y<0)
            System.out.print("points lies in 3rd quadrant");
        else if(x>0 && y<0)
            System.out.print("points lies in 4th quadrant");
        else if(x==0 && y==0)
            System.out.print("points lies at origin");
        else if(x==0)
            System.out.print("point lies on y axis");
        else if(y==0)
            System.out.print("point lies on the x axis");
        
         sc.close();

    }
    
}
