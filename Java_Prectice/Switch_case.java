import java.util.Scanner;

public class Switch_case
{
    public static void main(String[] args) {
        int a,b,output=0;
        char operator;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number:");
        a=sc.nextInt();

        System.out.println("Enter Operator:");
        operator=sc.next().charAt(0);

        System.out.println("Enter Second Number:");
        b=sc.nextInt();

        switch (operator)
        {
            case '+':
                output=a+b;
                System.out.println("Addition: "+output);
                break;

            case '-':
                output=a-b;
                System.out.println("Substraction: "+output);
                break;

            case '*':
                output=a*b;
                System.out.println("Multiplication: "+output);
                break;

            case '/':
                output=a/b;
                System.out.println("Division: "+output);
                break;

            default:
                System.out.println("Invalid Operator:");
                break;
        }
    }
}

