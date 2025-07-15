class Base1{
    Base1(){
        System.out.println("I am a Base1 class contructor");
    }
    Base1(int x){
        System.out.println("I am a Overloed constructor with the value of x as : " +x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super(1);  //<-- "super();" Key word use for call whidth argument
        System.out.println("I am a Derived class contructor");
    }
    Derived1(int x, int y){
        super(x)    ;
        System.out.println("I am a Overloed constructor with the value of y as : " +y);
    }
}

class ChildOfDerived extends Derived1
{
    ChildOfDerived(){
        System.out.println("I am a Child of derived constructor");
    }

    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am a Overloed constructor with the value of z as : " +z);
    }
}

public class V46_Constructors_in_inheritance {
    @SuppressWarnings("unused")
    public static void main(String ar []){
        Base1 b = new Base1();
        //Derived1 d = new Derived1(3,4);
//        ChildOfDerived cd = new ChildOfDerived(1,2,3);
    }
}
