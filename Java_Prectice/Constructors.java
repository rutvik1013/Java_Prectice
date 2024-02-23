
// Constructor overloading
class name_f{
    String name;
    int age;
    long phone_number;

    name_f(String name){
        System.out.println("Name:"+name);

    }
    name_f(int age){
        System.out.println("Age:"+age);
    }
    name_f(long phone_number){
        System.out.println("Phone_Number:"+phone_number);
    }

}
public class Constructors {
    public static void main(String[] args) {
        name_f nm1=new name_f("Rutvik");
        name_f a2=new name_f("23");
        name_f p3=new name_f("6351202084");
    }
}