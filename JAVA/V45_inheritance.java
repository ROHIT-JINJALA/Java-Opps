class Base{
    int x;
     
    public int getX(){
        return x;
    }

    public void setX(int x){
        System.out.println("I am in Base and settint x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constuctor");
    }
}

class Derived  extends Base{    // <-- "base" class is a perent class & derived class is "chaild" class. for merging we use " extends " key word.
    int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println("I am in Derived and settint y now");
        this.y = y;
    }
}
public class V45_inheritance {
    public static void main(String ar[]){
        Derived b = new Derived();
        b.setX(65);
        System.out.println(b.getX());
        
    }
}
