package lesson5;

public class Circle implements Shape {
    private double a;

    protected Circle(double r) {
        a = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * a;
    }

    @Override
    public double getSquare() {
        return PI * a * a;
    }

    static class Sphere {
        private double r;

        protected Sphere(double r) {
            this.r = r;
        }

        protected double getVolume() {
            return (4 * PI * r * r * r) / 3;
        }

        protected double getSquare() {
            return 4 * PI * r * r;
        }
    }
}
