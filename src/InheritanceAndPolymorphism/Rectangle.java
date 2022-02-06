package InheritanceAndPolymorphism;

import AbstractClassesAndInterfaces.GeometricObject;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 2);
        Rectangle r2 = new Rectangle(3, 2);
        r1.getArea();
        r2.getArea();
        max(r1, r2);
    }
    public Rectangle(){

    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        area = width * height;
        return area;
    }

    public double getPerimeter(){
        return 2* (width + height);
    }
}
