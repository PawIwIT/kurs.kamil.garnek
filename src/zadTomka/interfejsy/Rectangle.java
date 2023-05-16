package zadTomka.interfejsy;

public class Rectangle implements Figure {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimetr() {
        return 2 * a + 2 * b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    public String getType() {
        return "rectangle";
    }
}
