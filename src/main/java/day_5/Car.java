package day_5;

public class Car {
    private String model;
    private String color;
    private String year;

    public Car() {
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }

    public String info() {
        return "Это автомобиль";
    }

    public String yearDifference(int yearDiff) {
        int year = Integer.parseInt(this.year);
        return String.valueOf(yearDiff - year);
    }
}
