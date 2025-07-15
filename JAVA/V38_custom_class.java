
class Employee{
    int id;
    String name;
    public void printDeatels(){
        System.out.println("My id is "+ id);
        System.out.println("My name is "+ name);
    }

}

public class V38_custom_class {
    
    public static void main(String ar[]){

        Employee harry = new Employee();
        harry.id = 103;
        harry.name = "CodeWithHarry";
        harry.printDeatels();
    }
}