import java.util.Scanner;

public class Relational_Operators
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a=sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b=sc.nextInt();

        System.out.println("Enter Third Number: ");
        int c= sc.nextInt();

        System.out.println("a>b: "+(a>b));
        System.out.println("a<b: "+(a<b));
        System.out.println("a>=b: "+(a>=b));
        System.out.println("a<=b: "+(a<=b));
        System.out.println("a==c: "+(a==c));
        System.out.println("a!=c: "+(a!=c));
    }
}
