
/*  9.1
Design a class named Rectangle to represent a rectangle.
The class contains:
Two double data fields named width and height that specify the width and
height of the rectangle. The default values are 1 for both width and height .
A no-arg constructor that creates a default rectangle.
A constructor that creates a rectangle with the specified width and height .
A method named getArea() that returns the area of this rectangle.
A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class then implement the class. Write a test pro-
gram that creates two Rectangle objects—one with width 4 and height 40 , and
the other with width 3.5 and height 35.9 . Display the width, height, area, and
perimeter of each rectangle in this order.
*/
public class Rectangle {
    private double width = 1;
    private double height = 1;
    public static void main(String [] args){
        System.out.println("Rectangle 1");
        Rectangle R = new Rectangle(3.5, 35.9);
        System.out.println("Width: "+R.width);
        System.out.println("Height: "+R.height);
        System.out.println("Area: "+R.getArea());
        System.out.println("Perimeter: " +R.getPerimeter());

        System.out.println("---------------------------------");
        System.out.println("Rectangle 2");
        Rectangle B = new Rectangle(4,40);
        System.out.println("Width: "+B.width);
        System.out.println("Height: "+B.height);
        System.out.println("Area: "+B.getArea());
        System.out.println("Perimeter: " +B.getPerimeter());
    }
    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        double area = width * height;
        return area;
    }
    public double getPerimeter(){
        double perimeter = (width *2) + (height *2);
        return perimeter;
    }
}
