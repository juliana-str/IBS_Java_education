package day_5;

public class TaskN {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMV");
        car.setColor("Blue");
        car.setYear("2023");
        System.out.println("Car{" +
                " model='" + car.getModel() + '\'' +
                ", color='" + car.getColor() + '\'' +
                ", year='" + car.getYear() + '\'' + "}");
        Motorbike motorbike = new Motorbike("Yamaha", "Red", "2020");
        System.out.println("Motorbike{" +
                " model='" + motorbike.getModel() + '\'' +
                ", color='" + motorbike.getColor() + '\'' +
                ", year='" + motorbike.getYear() + '\'' + "}");
    }
}
