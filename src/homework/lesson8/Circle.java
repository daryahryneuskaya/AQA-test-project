package homework.lesson8;

public class Circle extends Figure {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * r;
    }

    @Override
    public double calculateArea() {
        return 3.14 * r * r;
    }
}
