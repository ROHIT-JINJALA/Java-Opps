import java.sql.SQLOutput;

//1
abstract class Pen {
    abstract void write();
    abstract void refill();
}

//2 -
class FountainPen extends Pen{              //<-- concrit class
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("changing the Nib");
    }
}

//3
class Monkey {
    void jump(){
        System.out.println("jump");
    }
    void bite(){
        System.out.println("bite");
    }
}
interface BasicAnimal {
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eating ...");
    }
    public void sleep(){
        System.out.println("sleep");
    }
    void speak(){
        System.out.println("speaking...");
    }
}

//4
abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconect();
}
class SmartTelePhone extends TelePhone{
    void flesh(){
        System.out.println("turn on Flesh light");
    }
    public void ring(){
        System.out.println("ring...");
    }
    public void lift(){
        System.out.println("lift...");
    }
    public void disconect(){
        System.out.println("disconect...");
    }
}

//6
interface TVRemote {
    void on();
    void off();
}
class SmartTVRemote implements TVRemote{
    void change(){
        System.out.println("changeing chanel ");
    }
    public void on(){
        System.out.println("Turning on TV");
    }
    public void off(){
        System.out.println("Turning off TV");
    }
}

//7
class Tv implements TVRemote{
    public void on(){
        System.out.println("Turning on TV");
    }
    public void off(){
        System.out.println("Turning off TV");
    }
}

public class V60_Practice_set_abstract {
    public static void main(String[] args) {
        //Qs 1& 2
        FountainPen fp = new FountainPen();
        fp.changeNib();

        //Qs 3
        Human herry = new Human();
        herry.eat();

        //Qs 5
        Monkey m1 = new Human();   //<-- Polymorphisome
        m1.bite();
        m1.jump();
        //m1.speak();  --> Error
        BasicAnimal m2 = new Human();   //<-- Polymorphisome
        m2.eat();
        m2.sleep();
        //m1.speak();  --> Error

        //Qs 4
        TelePhone tf = new SmartTelePhone();    //<-- Polymorphisome
        tf.disconect();
        tf.lift();
        tf.ring();
       // tf.flesh();   --> Error

    }
}