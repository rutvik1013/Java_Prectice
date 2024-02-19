import java.util.Scanner;

public class Nasted_if
{
    public static void main(String[] args) {
        int a,b,c;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number:");
        a=sc.nextInt();

        System.out.println("Enter Second Number:");
        b=sc.nextInt();

        System.out.println("Enter Third Number:");
        c=sc.nextInt();

        if (a>b)
        {
            if (a>c)
            {
                System.out.println("The Maximum number is: "+a);
            }
            else
            {
                System.out.println("The Maximum Number is:"+c);
            }

        }
        else {
            if (b>c)
            {
                System.out.println("The Maximum Number is:"+b);

            }
            else
            {
                System.out.println("The Maximum Number is:"+c);
            }
        }
    }
}
