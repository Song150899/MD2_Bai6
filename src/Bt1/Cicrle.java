package Bt1;

public class Cicrle {
    private double radius = 1.0;
    private String color;

    public Cicrle() {
    }

    public Cicrle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDienTich() {
        return radius * radius * Math.PI;
    }

    public double getChuVi() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "radius= " + radius +
                ", color= " + color + '\'' +
                ", Chu vi= " + getChuVi() +
                " , Diện tích= " + getDienTich()
                ;
    }
}
