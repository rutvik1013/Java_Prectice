class name_f1{
    void print(){
        System.out.println("Rutvik");
    }
}
class  name_f2 extends name_f1{
    void print(){
        System.out.println("Jayaraj");
    }
}
class name_f3 extends name_f1{
    void print(){
        System.out.println("Bhavesh");
    }
}
class  name_f4 extends name_f1{
    void print(){
        System.out.println("Dhaval");
    }
}
public class PolyMorphism {
    public static void main(String[] args) {
        name_f1 nameF1;

        nameF1=new name_f2();
        nameF1.print();

        nameF1=new name_f3();
        nameF1.print();

        nameF1=new name_f4();
        nameF1.print();
    }
}