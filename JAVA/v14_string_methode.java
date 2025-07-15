// import java.util.Scanner;
public class v14_string_methode {
    public static void main(String ar[]){

        String name = "Rohit";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String nonTrimeString = "                       code     ";
        System.out.println(nonTrimeString.trim());   //after TRIMING

        System.out.println(name.substring(4));
        System.out.println(name.substring(0));             //R o h i t
        System.out.println(name.substring(2,5));           //0 1 2 3 4

        System.out.println(name.replace('i', 't'));
        System.out.println(name.replace("hit", "arme"));

        System.out.println(name.startsWith("Ro"));
        System.out.println(name.startsWith("ro"));

        System.out.println();

        System.out.println(name.endsWith("t"));
        System.out.println(name.endsWith("hg"));
        
        System.out.println(name.charAt(2));   //which char is place on at (index) possitoin;
        System.out.println(name.indexOf("h"));  //What is index of given String

        System.out.println();

        System.out.println(name.equals("Rohit"));
        System.out.println(name.equals("hdhbv"));

        System.out.println();

        System.out.println(name.equalsIgnoreCase("RoHIt"));

        System.out.println();

        //escape sequence 
        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \\ back slesh");
        System.out.println("I am escape sequence \n new line ");
        System.out.println("I am escape sequence \t tab space ");
        

    }
}