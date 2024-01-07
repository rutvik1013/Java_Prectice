import java.util.Scanner;

// Write a Program to check the given year is leap year or not.
public class Leap_Year_or_not
{
    public static void main(String[] args) {
        int y;

        Scanner s=new Scanner(System.in);

        System.out.println("Enter a Year: ");
        y=s.nextInt();

        if (y%4==0)
        {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }
    }
}
