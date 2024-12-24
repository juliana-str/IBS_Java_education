package day_9;

public class Rectangle extends Figure {
    public double weight;
    public double hight;

    public Rectangle(double weight, double hight, String color) {
        this.weight = weight;
        this.hight = hight;
        super.color = color;
    }

    @Override
    public double area() {
        return hight * weight;
    }

    @Override
    public double perimeter() {
        return (hight + weight) * 2;
    }
}
