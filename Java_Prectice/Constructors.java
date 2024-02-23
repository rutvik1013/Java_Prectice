
// Copy Constructors
class name_f{
    String surname;
    String name;
    name_f(String surname,String name){
        this.surname=surname;
        this.name=name;
    }
    name_f(name_f n1){
        this.surname=n1.surname;
        this.name=n1.name;

    }
}
public class Constructors {
    public static void main(String[] args) {
        name_f n1=new name_f("Babariya","Rutvik");
        System.out.println("Babariya Rutvik");

        name_f n2=new name_f("Babariya","Rutvik");
        System.out.println("Babariya Rutvik");
    }
}