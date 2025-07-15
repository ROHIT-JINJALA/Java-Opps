//1
class Circul{
    public int redius;
    Circul(int r){
        this.redius = r;
    }
    public double area(){
        return Math.PI*this.redius*this.redius;
    }
}
class Cylinder1 extends Circul{
    int height;
    Cylinder1(int r, int h){
        super(r);
        this.height = h;
    }
    public double volume(){
        return Math.PI *this.redius*this.redius*this.height;
    }
}



public class V52_Practice_Set_Inheritance {
    public static void main(String[] args) {
        //prectice Qs 1
        Cylinder1 obj = new Cylinder1(3, 5);

    }
}
