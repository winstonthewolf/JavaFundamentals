package AbstractClassesAndInterfaces;

        import InheritanceAndPolymorphism.Circle;

        import java.util.Objects;

public abstract class GeometricObject2 {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    protected double area, perimeter;

    protected GeometricObject2(){
        dateCreated = new java.util.Date();
    }

    protected GeometricObject2(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "created on "+ dateCreated + "\ncolor " + color + " and filled:" +filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeometricObject2)) return false;
        GeometricObject2 that = (GeometricObject2) o;
        return filled == that.filled && Double.compare(that.area, area) == 0 && color.equals(that.color) && dateCreated.equals(that.dateCreated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, filled, dateCreated, area);
    }
}
