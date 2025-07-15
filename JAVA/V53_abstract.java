
abstract class Parent{
    public Parent(){
        System.out.println("I am a parent constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet1();
    abstract public void greet2();
}

class Child1 extends Parent{
    public void greet1(){
        System.out.println("Namaste");
    }
    public void greet2(){
        System.out.println("Good morning");
    }
}

abstract class Child2 extends Parent{
    public void extra(){
        System.out.println("I am Good");
    }
}
public class V53_abstract  {
    public static void main(String arrgue[]){
        Child1 c1 =new Child1();
    //Child2 c = new Child2();  // -->>   abstract class na object ne access na kari shakay

    }
}
