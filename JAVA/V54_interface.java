interface Bicycle{
    int a =215;
    void applyBrake(int decriment);
    void applyAccelerate(int incriment);
}
interface HornBicycle{
    void blowHornk3g();
    void blowHornmhn();
}

class Avon implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("pop..pop..");
    }
    public void applyBrake(int decriment){
        System.out.println("Applying Brake");
    }
    public void applyAccelerate(int incriment){
        System.out.println("Applying Accelerate");
    }
    public void blowHornk3g(){
        System.out.println("kabhi khushi kabhi gum");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon na");
    }
}

public class V54_interface {
    public static void main (String[] args){

        Avon ac = new Avon();
        ac.applyAccelerate(56);
        System.out.println(ac.a);

        ac.blowHornk3g();
        ac.blowHornmhn();
    }
}