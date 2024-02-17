import java.util.Locale;

public class String_Method
{
    public static void main(String[] args) {
        String fullname="BabariyaRutvik";

        //  Length Method.

        int length=fullname.length();
        System.out.println(length);

        //  toLowerCase Method

        String lfullname=fullname.toLowerCase();
        System.out.println(lfullname);

        //  toUpperCase Method.

        String ufullname=fullname.toUpperCase();
        System.out.println(ufullname);

        //  trim Method.

        String nonTrimmedString="     BabariyaRutvik         ";
        System.out.println(nonTrimmedString);

        String trimmedstring=nonTrimmedString.trim();
        System.out.println(trimmedstring);

        //  SubString Method.
        System.out.println(fullname.substring(12));
        System.out.println(fullname.substring(1,5));

        // Replace Method.
        System.out.println(fullname.replace('R','S'));
        System.out.println(fullname.replace("B","Rutvik"));

        //  StartWith and endWith Method.
        System.out.println(fullname.startsWith("Baba"));
        System.out.println(fullname.endsWith("vik"));

        // CharAt Method.

        System.out.println(fullname.charAt(9));

        // indexOf Method.

        String modifiedName="Rutvikrut";
        System.out.println(modifiedName.indexOf("ik"));
        System.out.println(modifiedName.indexOf("kru",4));
        System.out.println(modifiedName.lastIndexOf("tvi",5));

        // Equal To and equalsIgnoreCase Method.
        System.out.println(fullname.equals("BabariyaRutvik"));
        System.out.println(fullname.equalsIgnoreCase("babariyarutvikdfdf"));

        // Escape Sequenc
        System.out.println("My Name is Babariya Rutvik\ti am 22 years old ");

    }
}
