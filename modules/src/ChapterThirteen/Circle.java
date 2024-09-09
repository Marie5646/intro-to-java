package ChapterThirteen;


public class Circle extends GeometricObject implements Comparable<Circle> {
     private double radius;

     public Circle() {
     }

     public Circle(double radius) {
              this.radius = radius;
            }

     public Circle(double radius, String color, boolean filled) {
              this.radius = radius;
              setColor(color);
              setFilled(filled);
     }

     public double getRadius() {
           return radius;
         }

     public void setRadius(double radius) {
           this.radius = radius;
         }

         public double getArea() {
           return radius * radius * Math.PI;
         }

     public double getDiameter() {
         return 2 * radius;
     }

     public double getPerimeter() {
          return 2 * radius * Math.PI;

     }
    @Override
    public int compareTo(Circle o) {
        return Double.compare(radius, o.getRadius());
    }

     public void printCircle() {
       System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
     }

    public static void main(String[] args) {
        Circle circle1 = new Circle(2 , "blue", true );
        Circle circle2 = new Circle(4,"red", false );
        int comparison = circle1.compareTo(circle2);

        if (comparison > 0) {
            System.out.println("Circle 1 has a bigger radius");
        } else if (comparison < 0) {
            System.out.println("Circle 2 has a bigger radius");
        } else {
            System.out.println("Both circles have the same radius.");
        }


    }


}