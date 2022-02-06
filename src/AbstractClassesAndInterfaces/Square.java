package AbstractClassesAndInterfaces;

import InheritanceAndPolymorphism.Circle;
import InheritanceAndPolymorphism.Rectangle;

public class Square extends GeometricObject implements Colorable{

    private double side;


    public static void main(String[] args) {
        GeometricObject [] geoObjArr = new GeometricObject[4];
        Square house = new Square(2);
        Square box = new Square(6);
        Circle ball = new Circle(9);
        Rectangle hangar = new Rectangle(7, 4);
        house.getArea();
        box.getArea();
        ball.getArea();
        hangar.getArea();

        geoObjArr[0] = house;
        geoObjArr[1] = hangar;
        geoObjArr[2] = box;
        geoObjArr[3] = ball;

        for (GeometricObject geometricObject : geoObjArr) {
            System.out.println(geometricObject.getClass().getSimpleName() + ": " + geometricObject.area);
            if (geometricObject instanceof Colorable)
                ((Colorable) geometricObject).howToColor();
        }


    }
    Square(){
        side = 0;
    }

    Square(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        area = Math.pow(side, 2);
        return area;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
