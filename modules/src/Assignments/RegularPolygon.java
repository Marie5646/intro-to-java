package Assignments;

public class RegularPolygon {
   private int n = 3;
   private double side = 1;
   private int x = 0;
   private int y = 0;

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }


    public RegularPolygon(int n, double side, int x, int y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getArea() {
        return n * side;
    }
    public double getPerimeter() {
        return (2 * n * side) / (4 * Math.tan(Math.toRadians(side)));
    }

    public static void main(String[] args) {
        RegularPolygon rp1 = new RegularPolygon(6, 4);
        RegularPolygon rp2 = new RegularPolygon(10, 4.0, (int) 5.6, (int) 7.8);
        System.out.println(rp1.getArea());
        System.out.println(rp1.getPerimeter());
        System.out.println(rp2.getArea());
        System.out.println(rp2.getPerimeter());
    }
}
