import java.util.Scanner;

public class Area_of_Triangle
{
    public static void main(String[] args) {
        float base = 0,height=0,area;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Base pf Triangle: ");
        base=s.nextFloat();
        System.out.println("Enter The Height Of the Triangle: ");
        height=s.nextFloat();

        area=(base*height)/2;
        System.out.println("Area of Triangle is: "+area);


    }
}
