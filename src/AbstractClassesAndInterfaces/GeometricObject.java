package AbstractClassesAndInterfaces;

import java.util.Objects;

public abstract class GeometricObject implements Comparable<GeometricObject> {
   private String color = "white";
   private boolean filled;
   private java.util.Date dateCreated;
   protected double area;

   protected GeometricObject(){
      dateCreated = new java.util.Date();
   }

   protected GeometricObject(String color, boolean filled){
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

   public static void max(GeometricObject o, GeometricObject o2){
      if (o.compareTo(o2) == -1)
         System.out.println("Object o2 is bigger");
      else if (o.compareTo(o2) == 1)
         System.out.println("Object o is bigger");
      else
         System.out.println("Both object are the same size");
   }

   @Override
   public int compareTo(GeometricObject o) {
      if (this.area < o.area)
         return -1;
      else if (this.area > o.area)
         return 1;
      else
         return 0;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof GeometricObject)) return false;
      GeometricObject that = (GeometricObject) o;
      return filled == that.filled && Double.compare(that.area, area) == 0 && color.equals(that.color) && dateCreated.equals(that.dateCreated);
   }

   @Override
   public int hashCode() {
      return Objects.hash(color, filled, dateCreated, area);
   }
}
