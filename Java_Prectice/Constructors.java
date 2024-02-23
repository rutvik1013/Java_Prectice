class name{

    // Paramiterised Constructors
    String surname;
    String name;

    name(String surname,String name){
        this.surname=surname;
        this.name=name;

    }
}
public class Constructors {
    public static void main(String[] args) {
        name fullname=new name("Babariya","Rutvik");
        System.out.println("Babariya Rutvik");
    }
}