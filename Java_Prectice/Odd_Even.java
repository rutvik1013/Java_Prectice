import java.util.Scanner;

public class Odd_Even
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;

        System.out.println("Enter Number: ");
        a=sc.nextInt();
        if (a%2==0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
