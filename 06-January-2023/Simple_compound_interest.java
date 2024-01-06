import java.util.Scanner;

public class Simple_compound_interest
{
    public static void main(String[] args) {
        float p,r,t,a,si,ci;
        Scanner scr=new Scanner(System.in);

        System.out.println("Enter The Value Of Principle: ");
        p=scr.nextFloat();

        System.out.println("Enter The Value of Rate: ");
        r=scr.nextFloat();

        System.out.println("Enter The Value Of Time Duration: ");
        t=scr.nextFloat();

        si=(p*r*t)/100;
        System.out.println("Simple Interest is:"+si);
        a=(float) (p*Math.pow((1+r/100),t));
        ci=a-p;
        System.out.println("Coumpound Interest is:"+ci);

    }
}
