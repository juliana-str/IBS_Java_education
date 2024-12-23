package day_5;

public class Motorbike {
    public String year;
    public String model;
    public String color;

    public Motorbike(String model, String color, String year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String info() {
        return "Это мотоцикл";
    }

    public String yearDifference(int yearDiff) {
        int year = Integer.parseInt(this.year);
        return String.valueOf(yearDiff-year);
    }
}
