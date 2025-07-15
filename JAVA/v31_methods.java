public class v31_methods {

    // static int logic(int x, int y)     //<== using static method
    int logic(int x, int y)               //<== Using OBJECT Method
    { 
        int z;
        if (x>y) {
            z= x+y; 
        }else{
            z= (x+y)*2;
        }
        return z;
    }
    public static void main(String ar[]){
        int a = 3;
        int b = 5;
        int c;

        // c = logic(a,b);                     //<== Using static method
        v31_methods obj = new v31_methods();   //<== Using OBJECT Method
        c = obj.logic(a,b);
        System.out.println(c);
    }
}