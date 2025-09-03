package homework.lesson8;

class Triangle extends Figure {

    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        double p = (a + b + c) / 2.0; //полупериметр
        return (p * (p - a) * (p - b * (p - c)));
    }
}
