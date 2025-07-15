public class v34_recursion {
    public static int factorial(int x){    //recursion always neet base condition to when it's stop.
        if (x==0 || x==1) {
            return 1;
        }else{
        return x * factorial(x-1);
        }
    }

    public static int factorial_iterativ(int x){  //using Loop
        if (x==0 || x==1) {
            return 1;
        }
        else{
            int product = 1;
            for(int i =1; i<=x; i++){
            product *= i ;
            }
            return product;
        }
    }
    //Fibonacci function
    public static void fibonacci(int x){
        int num1 = 0, num2 = 1;
        for(int i=0; i<x; i++){
            System.out.print(num1 +" ");

            int num3 = num1 +num2;

            num1 = num2;
            num2 = num3;           
        }
    }
    public static void main(String ar[]){ 
        int n=5;
        System.out.println(factorial(n));
        System.out.println(factorial_iterativ(n));

        //Fibonacci 
        int num =5;
        fibonacci(num);
         
    }
}
