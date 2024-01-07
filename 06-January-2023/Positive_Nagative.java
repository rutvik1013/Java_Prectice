import java.util.Scanner;

//  Write a Program to check the given number is Positive or Nagative
public class Positive_Nagative {
    public static void main(String[] args) {
        int n;

        Scanner sct=new Scanner(System.in);

        System.out.println("Enter Number: ");
        n=sct.nextInt();

        if (n>=0)
        {
            System.out.println("Positive Number");
        }
        else
        {
            System.out.println("Nagative Number");
        }

    }
}
