import java.util.Scanner;

public class Tarnary_Operators
{
    public static void main(String[] args) {
        int a,b,c,result;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number:");
        a= sc.nextInt();

        System.out.println("Enter Second Number:");
        b=sc.nextInt();

        System.out.println("Enter Third Number:");
        c= sc.nextInt();

        result=((a>b)?(a>c)?a:c:(b>c)?b:c);
        System.out.println("Max Of Three Numbers: "+result);
    }
}
