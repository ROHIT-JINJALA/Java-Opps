//1
class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String gatName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

//2
class Phone{
    public void ring(){
        System.out.println("Ringing. . .");
    }
    public void vibrat(){
        System.out.println("Vibrating ...");
    }
}
//3
class Square{
    int side;

    public int area(){
        return side * side;
    }

    public int perimeter(){
        return 4 * side;
    } 
}
//4
class Rectangle{
    int l;
    int b;
    public int area(){
        return l * b;
    }
    public int perimeter(){
        return 2 * (l + b);
    }
}
//5
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Runig from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
//6
class Circal{
    double r;
    public double area(){
        return 3.14 * r * r;
    }
    public double perimeter(){
        return 2 * 3.14 * r;
    }
}

public class V39_Practice_Set_custom_class {
    public static void main(String[] args) {
        // Practice Qs 1
        // Employee1 harry = new Employee1();
        // harry.setName("Rohit");
        // harry.salary = 323;
        // System.out.println(harry.gatName());
        // System.out.println(harry.getSalary());

        // Practice Qs 2
        // phone samsung = new Phone();
        // samsung.ring();
        // samsung.vibrat();

        // Practice Qs 3
        // Square squ = new Square();
        // squ.side = 5;
        // System.out.println(squ.area());
        // System.out.println(squ.perimeter());

        // Practice Qs 4
        // Rectangle rec = new Rectangle();
        // rec.l = 4;
        // rec.b = 2;
        // System.out.println(rec.area());
        // System.out.println(rec.perimeter());

        // Practice Qs 5
        // Tommy playar1 = new Tommy();
        // playar1.fire();
        // playar1.run();
        // playar1.hit();

        // Practice Qs 6
        Circal cir = new Circal();
        cir.r = 5;
        System.out.println(cir.area()); 
        System.out.println(cir.perimeter()); 

    }
}