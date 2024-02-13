import java.util.Scanner;

public class Simple_Compoundinterest
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float p,r,t,si,ci,a;

        System.out.println("Enter the Principle Value:");
        p=sc.nextFloat();

        System.out.println("Enter The Value Of Rate:");
        r=sc.nextFloat();

        System.out.println("Enter The Time Duration:");
        t=sc.nextFloat();

        si=(p*r*t)/100;
        System.out.println("Simple Interest:"+si);

        a=(float) (p*Math.pow((1+r/100),t));
        ci=a-p;
        System.out.println("Compound Interest:"+ci);

    }
}
