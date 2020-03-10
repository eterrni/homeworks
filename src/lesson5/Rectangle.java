package lesson5;

import static java.lang.Math.sqrt;

public class Rectangle implements Shape {
    private double a, b;

    protected Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public double getSquare() {
        return a * b;
    }

    protected double getDiagonal() {
        return sqrt(a * a + b * b);
    }

    static class Cylinder {
        private double R, H;

        protected Cylinder(double R, double H) {
            this.R = R;
            this.H = H;
        }

        public double getSquare() {
            return 2 * PI * R * (H + R);
        }

        protected double getVolume() {
            return PI * R * R * H;
        }
    }
}
