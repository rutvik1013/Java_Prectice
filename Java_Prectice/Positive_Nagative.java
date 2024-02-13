import java.util.Scanner;

public class Positive_Nagative
{
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        number = sc.nextInt();

        if (number >= 0) {
            System.out.println("Positive Number");
        }
        else {
            System.out.println("Nagative Number");
        }
    }
}
