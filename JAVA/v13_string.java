import java.util.Scanner;

public class v13_string {
    @SuppressWarnings("resource")
    public static void main(String ar[]){
        String name = "Rohit";
        System.out.println(name);

        int a=6;
        float  b=45.578f;
        System.out.printf("a is equal to %d and b is equal to %f \n", a, b);
        System.out.format("a is equal to %d and b is equal to %f \n", a, b);
        
        Scanner sc = new Scanner(System.in);
        // String st = sc.next();
        String st = sc.nextLine();       // Space ni sathe aakhi line scane karva

        System.out.println(st);


        Scanner sca = new Scanner(System.in);
        String ram = sca.next();
        System.out.println(ram);
    }
}
