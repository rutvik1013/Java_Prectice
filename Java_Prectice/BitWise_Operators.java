import java.util.Scanner;

public class BitWise_Operators
{
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number:");
        a= sc.nextInt();

        System.out.println("Enter Second Number:");
        b=sc.nextInt();

        System.out.println("a&b:"+(a&b));
        System.out.println("a|b:"+(a|b));
        System.out.println("a^b:"+(a^b));
        System.out.println("~b:"+(~b));

    }
}
