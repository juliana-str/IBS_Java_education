package day_9;

public class Circle extends Figure {
    public double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        super.color = color;
    }

    @Override
    public double area() {
        return Math.sqrt(4 * Math.PI * perimeter());
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
