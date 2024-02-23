public class PolyMorphism
{
    public static void main(String[] args) {
        System.out.println(calc.add(17,6));
        System.out.println(calc.sub(10,5));
        System.out.println(calc.mul(18,8));
        System.out.println(calc.div(10,2));
    }
}
class calc{
    //Method 1
    static int add(int a,int b){
        int add;
        return a+b;

        //Method 2
    }
    static int sub(int a,int b){
        int sub;
        return  a-b;
    }
    static int mul(int a,int b){
        int mul;
        return a*b;
    }
    static int div(int a,int b){
        int div;
        return a/b;
    }
}
