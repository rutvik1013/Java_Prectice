import java.util.Scanner;

// Write a program to find the Area of Circle
public class Area_of_Circle
{
    public static void main(String[] args) {
        int r;
        double pi=3.14,area;
        System.out.print("Enter Radius of Circle: ");
        Scanner s=new Scanner(System.in);
        r=s.nextInt();
        area=pi*r*r;
        System.out.println("Area Of Circle is:"+area);
    }
}
