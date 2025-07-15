//1
class Cylinder{
    private int heigth;
    private int radius;


    //3
    public Cylinder(int heigth, int radius){
        this.heigth = heigth;
        this.radius = radius;
    }


    public void setRedius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeigth(int heigth){
        this.heigth = heigth;
    }
    public int getHeigth(){
        return heigth;
    }
    //2
    public double surfaceArea(){
        return 
        (2 * Math.PI * radius * radius) + (2 * 3.14 * radius * heigth);
    }
    public double volume(){
        return Math.PI * radius * radius * heigth;
    }
}

//4
class Rectangle1{
    private int length;
    private int breadth;

     public Rectangle1(){
        this.length = 4;
        this.breadth = 5;
     }

     public Rectangle1(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
     }

     public int getLength(){
        return length;
     }

     public int getBreadth(){
        return breadth;
     }
}

public class V44_Practice_Set_constructor {
    public static void main(String ar[]){
        // Practice Qs 1
        // Cylinder cy = new Cylinder();
        // cy.setHeigth(5);
        // cy.setRedius(3);
        // System.out.println(cy.getHeigth());
        // System.out.println(cy.getRadius());

        // Practice Qs 2
        // Cylinder cy = new Cylinder();
        // System.out.println(cy.surfaceArea());
        // System.out.println(cy.volume());

        // Practice Qs 3
        // Cylinder cy = new Cylinder(5,3);
        // System.out.println(cy.surfaceArea());
        // System.out.println(cy.volume());

        // Practice Qs 4
        // Rectangle1 rec = new Rectangle1(5 , 6);
        Rectangle1 rec = new Rectangle1(5,6);
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());
    }
}