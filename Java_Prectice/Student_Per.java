import java.util.Scanner;

public class Student_Per
{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        float per;
        int b,c,p,a,e;
        int total;

        System.out.println("Enter The Marks Of Biology:");
        b=scr.nextInt();

        System.out.println("Enter The Marks Of Chemistry:");
        c=scr.nextInt();

        System.out.println("Enter The Marks Of Physics:");
        p=scr.nextInt();

        System.out.println("Enter The Marks Of Accountancy:");
        a=scr.nextInt();

        System.out.println("Enter The Marks Of Economics:");
        e=scr.nextInt();

        total=b+c+p+a+e;
        System.out.println("Total Marks:"+total);

        per=total/5;
        System.out.println("Percentage:"+per);


        if (per>100)
        {
            System.out.println("Enter Valid Percentage");
        }
        else if (per>75)
        {
            System.out.println("Distrinction");
        }
        else if (per>60&&per<=75)
        {
            System.out.println("First Class");
        }
        else if (per>50&&per<=60)
        {
            System.out.println("Second Class");
        }
        else if (per>35&&per<=50)
        {
            System.out.println("Pass Class");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
