import java.util.Scanner;

// Write a program to make addition, Subtraction, Multiplication and Division of
//Two Numbers.
public class Calculator
{
    public static void main(String[] args) {
        double a,b,output = 0;
        char operator;

        Scanner s=new Scanner(System.in);

        System.out.println("Enter First Number:");
        a=s.nextDouble();

        System.out.println("Enter Operator:");
        operator=s.next().charAt(0);

        System.out.println("Enter Second Number:");
        b=s.nextDouble();

        switch (operator)
        {
            case '+':
                output=a+b;
                break;

            case '-':
                output=a-b;
                break;


            case '*':
                output=a*b;
                break;

            case '/':
                output=a/b;
                break;

            default:
                System.out.println("Enter Valid Operator:");
                break;

        }
        System.out.println(a+" "+operator+" "+b+" : "+output);





    }
}
