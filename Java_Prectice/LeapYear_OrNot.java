import java.util.Scanner;

public class LeapYear_OrNot
{
    public static void main(String[] args) {
        int y;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Year:");
        y=sc.nextInt();

        if (y%4==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not Leap Year");
        }
    }
}
