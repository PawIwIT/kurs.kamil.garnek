package zadTomka.interfejsy;

public class Triangle implements Figure {

    private double a;
    private double b;

    private double przeciwprostokatna;


    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.przeciwprostokatna =Math.sqrt(a*a+b*b);

    }

    @Override
    public double getPerimetr() {
        return a+b+przeciwprostokatna;
    }

    @Override
    public double getArea() {
        return a*b/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", przeciwprostokatna=" + przeciwprostokatna +
                '}';
    }

    @Override
    public String getType() {
        return "triangle";
    }
}
