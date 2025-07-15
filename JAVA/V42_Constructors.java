class Employee2{
    private int id;
    private String name;

    // public Employee2(){                   //--> constructor name is equal to class name .
    //     id = 5;
    //     name = "This is a construvtor";
    // }
    public Employee2(String myName, int myId){      //--> constructor name is equal to class name & we can pass an argument.
        id = myId;
        name = myName;
    }
    public String gatName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int gatId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }
}
public class V42_Constructors {
    public static void main(String ar[]){
        Employee2 e1 = new Employee2("rohit", 7);
        System.out.println(e1.gatId());
        System.out.println(e1.gatName());
    }
}