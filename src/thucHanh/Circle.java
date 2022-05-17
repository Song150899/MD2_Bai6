package thucHanh;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDienTich() {
        return radius * radius * Math.PI;
    }

    public double getChuVi() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Diện tích: " + getDienTich() +
                "\n Chu vi: =" + getDienTich();
    }
}
