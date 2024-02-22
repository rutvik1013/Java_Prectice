
class add{
    int a=10,b=12,sum;
    public void addition(){
        sum=a+b;
        System.out.println("The Sum is:"+sum);

    }
}
class substraction extends add{
    int a=165,b=90,sub;
    public void substraction(){
        sub=a-b;
        System.out.println("The Substraction is:"+sub);
    }
}
class multiplication extends substraction {
    int a=12,b=5,mul;
    public void multiplication()
    {
        mul=a*b;
        System.out.println("The Multiplication is:"+mul);
    }
}
class division extends multiplication{
    float a=40,b=11,div;
    public void division(){
        div=a/b;
        System.out.println("The Division is:"+div);
    }
}
public class Multi_level {
    public static void main(String[] args) {
        division div=new division();
        div.addition();
        div.substraction();
        div.multiplication();
        div.division();
    }
}
