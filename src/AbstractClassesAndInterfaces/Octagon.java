package AbstractClassesAndInterfaces;

public class Octagon extends GeometricObject2 implements Comparable<Octagon>, Cloneable {

    private double side;


    public static void main(String[] args) {
        Octagon firstOctagon = new Octagon(3);
        firstOctagon.getArea();
        Octagon secondOctagon = (Octagon) firstOctagon.clone();
        secondOctagon.getArea();
        System.out.println(firstOctagon == secondOctagon);        //Should print out false since different objects
        System.out.println(firstOctagon.equals(secondOctagon)); //Should print out 0 since same property values
    }


    Octagon(){}

    Octagon(double side){
        this.side = side;
    }
    public void getSide(){
        System.out.println(side);
    }
    public void setSide(double side){
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        perimeter = side * 8;
        return perimeter;
    }

    public double getArea(){
        area = ((2 + 4 * Math.sqrt(2))) * side * side;
        return area;
    }

    public int compareTo(Octagon o){
        if( area < o.getArea()){
            return 1;
        }
        if( area > o.getArea()){
            return -1;
        }
        else
            return 0;
    }

    public boolean equals(Octagon o){
        return area == o.area;
    }
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }

    }
}
