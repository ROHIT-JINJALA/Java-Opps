public class v33_varargs {

    public static int sum(int x, int ...arr){
        int result = x;
            for(int element : arr){
                result += element;
            }
        return result;
    }
    public static void main(String ar[]){
        // System.out.println("Sum of 1 is : " + sum());
        System.out.println("Sum of 1 and 5 is : " + sum(1, 5));
        System.out.println("Sum of 1, 2 and 5 is : " + sum(1, 2, 5));
        System.out.println("Sum of 1, 2, 3 and 5 is : " + sum(1, 2, 3, 5));
        System.out.println("Sum of 1, 2, 3, 4 and 5 is : " + sum(1, 2, 3, 4, 5));
    }
}