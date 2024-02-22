 class one {
    public void surname(){
        System.out.println("Babariya");
    }

}
class two extends one{
    public void name(){
        System.out.println("Rutvik");
    }
}
public class single_level{
    public static void main(String[] args) {
        two t=new two();
        t.surname();
        t.name();
    }
}
