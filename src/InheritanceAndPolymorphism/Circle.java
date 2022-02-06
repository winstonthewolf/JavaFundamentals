package InheritanceAndPolymorphism;

import AbstractClassesAndInterfaces.GeometricObject;

public class Circle extends GeometricObject {
    private double radius;

    public static void main(String[] args) {
        Circle c1 = new Circle(3.0);
        Circle c2 = new Circle(4.0);
        c1.getArea();
        c2.getArea();
        max(c1, c2);
    }
    public Circle() {

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius,
                  String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        area = radius * radius * Math.PI;
        return area;
    }

    public double getDiameter() {
        return 2* radius;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void printCircle(){
        System.out.println("The circle is created "+ getDateCreated() + " and the radius is "+ radius);
    }


    
}
