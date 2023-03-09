import java.util.Scanner;

public class string_methods {
    public static void main(String[] args) {
        String wow1="Ankit";
        Scanner sc =new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(st);


     String wow=new String("Ankitbro");
        System.out.println(wow);
        System.out.println(wow.length());
        System.out.println(wow.toLowerCase());
        System.out.println(wow.toUpperCase());
        System.out.println(wow.trim());
        System.out.println(wow.substring(4));//All last words are print;
        System.out.println(wow.substring(0,7));//zero to all values print;
        System.out.println(wow.replace("bro","cool"));//only use in "" inside;
        System.out.println(wow.startsWith("A"));
        System.out.println(wow.startsWith("a"));
        System.out.println(wow.endsWith("o"));
        System.out.println(wow.charAt(3));//written in the terms of index;
        System.out.println(wow.indexOf("A"));
        System.out.println(wow.equals("Ankitbro"));
        System.out.println(wow.equals("Ankitcool"));
        System.out.println(wow.equalsIgnoreCase("ankitbro"));
        System.out.println("\n");//for new line making;
        System.out.println("\\");//that is used for  taking slash:
        System.out.println("\t");//that is used for taking new tab
    }
}
