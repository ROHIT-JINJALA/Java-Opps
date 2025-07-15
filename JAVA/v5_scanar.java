import java.util.Scanner;

public class v5_scanar {
    @SuppressWarnings("resource")
    public static void main (String arr[]){
        System.out.println("This is for scanar function");

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first num n1 = ");
        // int a = sc.nextInt();
        // System.out.println(a);
        // System.out.println("Enter Second number n2 = ");
        // int b = sc.nextInt();
        // System.out.println(b);
        // int sum = a + b;
        // System.out.println("Your sum = "+sum);


        
        Scanner mu = new Scanner(System.in);
        System.out.println("Enter your first num : ");
        int c = mu.nextInt();
        System.out.println("Enter second num : ");
        int d = mu.nextInt();
        int mul = c * d;
        System.out.println("Your multiplicatin is = " +mul);

    }
}
