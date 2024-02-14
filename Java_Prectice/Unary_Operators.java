import java.util.Scanner;

public class Unary_Operators
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a,b;

        System.out.println("Enter First Number:");
        a=sc.nextInt();

        System.out.println("Enter Second Number:");
        b=sc.nextInt();

        // Unary Operators
        System.out.println("Postincreament: "+(a++));
        System.out.println("Preincreament: "+(++a));

        System.out.println("Postdecrement: "+(b--));
        System.out.println("Predecrement: "+(--b));
    }
}
