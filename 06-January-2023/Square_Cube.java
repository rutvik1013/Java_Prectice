import java.util.Scanner;

public class Square_Cube
{
    public static void main(String[] args) {
        int n,square,cube;

        System.out.println("Enter Number:\n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        square=n*n;
        cube=n*n*n;

        System.out.println("Squre of Number is:"+square);
        System.out.println("Cube of number is:"+cube);
    }
}
