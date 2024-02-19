import java.util.Scanner;

public class Area
{
    public static void main(String[] args) {

        // Area of Rectangle

        Scanner sc=new Scanner(System.in);
        int width,length,rectangle;

        System.out.println("Enter the Width of the Rectangle:");
        width=sc.nextInt();

        System.out.println("Enter the length of the rectangle:");
        length=sc.nextInt();

        rectangle=width*length;

        System.out.println("Area of Rectangle:"+rectangle);

        // Area of Triangle

        int base,height,triangle;

        System.out.println("Enter The base Of Triangle:");
        base=sc.nextInt();

        System.out.println("Enter the height of the height of the Triangle:");
        height=sc.nextInt();

        triangle=base*height/2;

        System.out.println("The Area of Triangle is: "+triangle);


         //Area of Circle
        int r;
        double pi=3.14,area;

        System.out.println("Enter the Radius of The circle:");
        r=sc.nextInt();

        area=pi*r*r;
        System.out.println("Area of Circle is:"+area);

    }
}
