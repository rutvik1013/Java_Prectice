import java.util.Scanner;

public class Kilometer_Miles
{
    public static void main(String[] args) {

        double k,m;

        Scanner s=new Scanner(System.in);

        System.out.println("Please Enter Your Kilometers:");
        k=s.nextDouble();

        m=k/1.6;

        System.out.println("Miles "+m);
    }
}
