import java.util.Scanner;

public class Percentage
{
    public static void main(String[] args) {
        float per;
        int total;
        int g,m,h,e,s;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Marks of Gujarati: ");
        g=sc.nextInt();

        System.out.println("Enter The Marks Of English: ");
        e=sc.nextInt();

        System.out.println("Enter The Marks Of Hindi: ");
        h=sc.nextInt();

        System.out.println("Enter The Marks Of Maths: ");
        m=sc.nextInt();

        System.out.println("Enter The Marks Of Science:");
        s=sc.nextInt();

        total=g+e+h+m+s;
        System.out.println("Total Marks: "+total);

        per=total/5;
        System.out.println("Percentage: "+per);

        if (per>100)
        {
            System.out.println("Enter Valid Percentage: ");
        } else if (per>75) {
            System.out.println("Distinction");
            
        } else if (per>60&&per<=75) {
            System.out.println("First Class");

            
        } else if (per>60&&per<=60) {
            System.out.println("Second Class");
            
        } else if (per>35&&per<=60) {
            System.out.println("Pass Class");
            
        }
        else {
            System.out.println("Fail");
        }


    }
}
