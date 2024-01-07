import java.util.Scanner;

//Write a program to convert kilometers to miles.
public class Kilometers_Miles {
    public static void main(String[] args) {
        double kilometers,miles;

        Scanner in=new Scanner(System.in);
        System.out.println("Enter Kilometers: ");
        kilometers=in.nextDouble();

        miles=kilometers/1.6;

        System.out.println("Miles:"+miles);
    }
}
