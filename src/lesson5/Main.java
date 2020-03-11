package lesson5;

import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        Romb romb = new Romb(2, 3);
        Circle circle = new Circle(10);
        Square square = new Square(8);
        Rectangle rectangle = new Rectangle(2, 6);
        //System.out.println(ShapeUtils.isRectangle(rectangle));

        //System.out.println(cylinder.getVolume());
        Circle.Sphere sphere = new Circle.Sphere(10);
//        System.out.println(rectangle.toString());
//        System.out.println(triangle.toString());
        System.out.println(circle.compareSquare(triangle));
    }
}
