package thucHanh;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape=new Shape("Black",false);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle("Blue",true,3.0);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();

        rectangle=new Rectangle("Black",true,5,3);
        System.out.println(rectangle.getColor());
        System.out.println(rectangle);
    }
}
