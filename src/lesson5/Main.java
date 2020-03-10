package lesson5;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        Romb romb = new Romb(2, 3);
        Circle circle = new Circle(10);
        Square square = new Square(8);
        Rectangle rectangle = new Rectangle(2, 6);
        //System.out.println(ShapeUtils.isRectangle(rectangle));
        Rectangle.Cylinder cylinder=new Rectangle.Cylinder(2,5);
        //System.out.println(cylinder.getVolume());
        Circle.Sphere sphere=new Circle.Sphere(10);
        System.out.println(sphere.getSquare());
        System.out.println(sphere.getVolume());
    }
}
