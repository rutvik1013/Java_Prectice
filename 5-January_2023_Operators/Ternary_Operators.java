//Ternary Operators Or Conditional Operators
public class Ternary_Operators {
    public static void main(String[] args) {

        int a=50,b=80,c=12,result;

        result=((a>b)?(a>c)?a:c:(b>c)?b:c);
        System.out.println("Max number is = "+result);
    }
}
