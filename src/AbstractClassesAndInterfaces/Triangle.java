package AbstractClassesAndInterfaces;

import java.util.Scanner;

public class Triangle extends GeometricObject{
    
    private double side1 = 0;
    private double side2 = 0;
    private double side3 = 0;
    private double area = 0;
    private double perimeter = 0;
    private double height =0;

    public static void main(String[] args) {
        double side1, side2, side3;
        boolean filled;
        String color;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of side1: ");
        side1 = input.nextDouble();
        System.out.println("Enter length of side2: ");
        side2 = input.nextDouble();
        System.out.println("Enter length of side3: ");
        side3 = input.nextDouble();
        input.nextLine();//To capture empty line
        System.out.println("Enter color: ");
        color = input.nextLine();
        System.out.println("Enter true or false for filled: ");
        filled = input.nextBoolean();

        Triangle triangle1 = new Triangle(side1, side2, side3, color, filled);
        triangle1.getArea();
        triangle1.getPerimeter();
        System.out.println(triangle1.toString());
    }


    Triangle(){};

    Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea(){
       height = Math.sqrt(Math.pow(side1/2, 2) + Math.pow(side2, 2));
       area = (side1 * height)/2 ;
       return area;
    }

    public double getPerimeter(){
        perimeter = side1 + side2 + side3;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", height=" + height +
                ", color=" + this.getColor() +
                ", filled=" + this.isFilled()+
                '}';
    }
}
