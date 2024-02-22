interface f_name{
    public void f_name();

}
interface adress{
    public void adress();

}
interface l_name extends f_name,adress{
    public void l_name();

}
class child implements l_name{
    @Override
    public void f_name() {
        System.out.println("Babariya");
    }
    public void adress()
    {
        System.out.println("Ahmedabad");
    }
    public void l_name(){
        System.out.println("Rutvik");
    }

}
public class Multiple_inheritance
{
    public static void main(String[] args) {
        child c=new child();
        c.f_name();
        c.l_name();
        c.adress();
    }
}