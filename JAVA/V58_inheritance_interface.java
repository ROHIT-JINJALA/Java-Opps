interface SampleInterface{
    void meth1();
    void meth2();
}
interface ChildSampleInterface extends SampleInterface{        // <-- interface ને પણ inherit કરી શકાય .
    void meth3();
    void meth4();
}
class MySempleClass implements ChildSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}

public class V58_inheritance_interface {
    public static void main(String[] args){
        MySempleClass sc = new MySempleClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}
