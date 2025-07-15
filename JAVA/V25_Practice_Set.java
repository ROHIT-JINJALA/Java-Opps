import java.util.Scanner;         //ADD BY VS Code it self
@SuppressWarnings("unused")       //ADD BY VS Code it self

public class V25_Practice_Set {
    
    public static void main(String arr[]){
        
        //Practice Qs 1 Patten using for loop
        // int n=4;
        // for(int i=n; i>0; i--){
        //     for(int j =0; j<i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        //Practice Qs 1.1 Patten using for loop
        //  int n=5;
        //  for(int i=0; i<n; i++){
        //     for(int j=0; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        //  }

        //Practice Qs 2 Sum of first N even number using while loop
        // int i=0;
        // int n=30;
        // int sum = 0;
        // while(i<n){
        //     sum= sum + (i*2);
        //     i++;
        // }
        // System.out.println("Sum of n number is =" +sum);

        //Practice Qs 3 Multiplicatin table 
        // Scanner num =new Scanner(System.in);
        // System.out.print("Which multiplicatin table you want ?");
        // int number = num.nextInt();
        // for(int i=1; i<=10; i++){
        //     System.out.println(number + "  X  " +i + "  =  " + (number*i));
        // }

        //Practice Qs 4 Reversc multiplication table
        // int number=10;
        // for(int i=10; i>0; i--){
        //     System.out.println(number + "  X  " +i + "  =  " + (number*i));
        // }

        //Practice Qs 5 Find facrorial using for loop
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        // int n = sc.nextInt();
        // int factorial = 1;
        // for(int i=n; i>0; i--){
        //     factorial = factorial*i;
        // }
        // System.out.println("The Factorial of "+n +" is = "  +factorial);

        //Practice Qs 6 factorial using while loop
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        // int n = sc.nextInt();
        // int factorial = 1;
        // int i=n;
        // while( i>0){
        //     factorial = factorial*i;
        //     i--;
        // }
        // System.out.println("The Factorial of "+n +" is = "  +factorial);

        // Practice Qs 7 Patten using while loop
        // int n=4;
        // while (n>0) {
        //     int j=0;
        //     while (j<n) {
        //         System.out.print("*");
        //         j++;                
        //     }
        //     System.out.print("\n");
        //     n--;
        // }

        // Practice Qs 9 Sum of 8th multiplication table's ans
        // int number = 8;
        // int sum = 0;
        // for(int i=1; i<=10; i++){
        //     System.out.println(number + "  X  " +i + "  =  " + (number*i));
        //     sum = sum +(number*i);
        // }
        // System.out.println(sum);

        // Practice Qs 11 Sum of first N even number using for loop
        int sum = 0;
        int n =4;
        for(int i=0; i<n; i++){
            sum = sum + (2*i);  
        }
        System.out.println("Sum of first " +n +" Even number is = " +sum);
    }
}
