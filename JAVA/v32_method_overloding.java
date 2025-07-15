public class v32_method_overloding {

    static int change1(int x){
        x= 10;
        return x;
    }
    static int chang2(int arr[]){
        arr[0]=20;
        return arr[0];
    }

    static void foo(){
        System.out.println("Good mornig bro!");
    }

    static void foo(int a){
        System.out.println("Good mornig " +a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good mornig " +a + " bro!");
        System.out.println("Good mornig " +b + " bro!");
    }
    public static void main(String ar[]){
        //Try to change an integer
        // int a= 39;
        // change1(a);
        // System.out.println("after change1 : "+a);    //no chang the integer.

        //Try to change in Array
        // int marks[] = {56, 76, 87, 89, 90};
        // chang2(marks);
        // System.out.println(marks[0]);      //chang in array element is possibal
        // for (int i : marks) {
        //     System.out.print(i +" ");
        // }

        // method overloding

        foo();
        foo(100);
        foo(100, 200);    //Arguments are actual!

    }
}
