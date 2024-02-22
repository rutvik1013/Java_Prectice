class name1{
    public void name1(){
        System.out.println("Babariya Rutvik");
    }
}
class name2 extends name1{
    public void name2(){
        System.out.println("Babariya Jayraj");
    }
}
class name3 extends name1{
    public void name3(){
        System.out.println("Babariya Dhaval");
    }
}
class name4 extends name1{
    public void name4(){
        System.out.println("Babariya Bhavin");
    }
}
public class Hierarchical_inharitance
{
    public static void main(String[] args) {
        name1 n=new name1();
        name2 n1=new name2();
        name3 n2=new name3();
        name4 n3=new name4();

        n.name1();
        n1.name2();
        n2.name3();
        n3.name4();

    }
}