package day_6;

import day_5.Car;
import day_5.Motorbike;

/**
 * В классах Автомобиль и Мотоцикл реализовать два метода:
 * info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 * yearDifference() - принимает на вход число (год), и возвращает разницу между
 * переданным годом и годом выпуска транспортного средства.
 */
public class Task_1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMV");
        car.setColor("Blue");
        car.setYear("2023");
        System.out.println(car.info() +
                " model='" + car.getModel() + '\'' +
                ", color='" + car.getColor() + '\'' +
                ", year='" + car.getYear() + '\'');
        System.out.println(car.yearDifference(2024));
        Motorbike motorbike = new Motorbike("Yamaha", "Red", "2020");
        System.out.println(motorbike.info() +
                " model='" + motorbike.getModel() + '\'' +
                ", color='" + motorbike.getColor() + '\'' +
                ", year='" + motorbike.getYear() + '\'');
        System.out.println(motorbike.yearDifference(2024));
    }
}
