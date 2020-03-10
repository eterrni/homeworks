package lesson5;

public class ShapeUtils {

    protected static boolean isRectangle(Shape shape) {
        return shape instanceof Rectangle;
    }

    protected static boolean isTriangle(Shape shape) {
        return shape instanceof Triangle;
    }
}
