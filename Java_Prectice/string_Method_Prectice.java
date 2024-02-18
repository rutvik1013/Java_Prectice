public class string_Method_Prectice
{
    public static void main(String[] args) {

          String name="BabariyaRutvik";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name);

        System.out.println(name.trim());

        System.out.println(name.startsWith("Ba"));
        System.out.println(name.endsWith("ik"));

        System.out.println(name.charAt(6));
        System.out.println(name.charAt(3));

        System.out.println(name.length());


        String s2=name.intern();
        System.out.println(s2);

        int a=10;
        String s=String.valueOf(10);
        System.out.println(s+10);

        String replace=name.replace("Rutvik","rrrrr");
        System.out.println(replace);

        String s1=name.substring(3,5);
        System.out.println(s1);

        System.out.print(name.indexOf('R'));

        System.out.println(name.equals("BabariyaRutvik"));
        System.out.println(name.equalsIgnoreCase("babariyarutvik"));



    }
}
