package day_6;

public class Airplane {
    public String producer;
    public int year;
    public int length;
    public int weight;
    public int fuel = 0;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;

    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return this.fuel;
    }

    public void fillUp(int value) {
        fuel += value;
    }

    public static int compareAirplanes(Airplane plane1, Airplane plane2) {
        return Math.abs(plane1.length - plane2.length);
    }

    public String info() {
        return "Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight
                + ", количество топлива в баке: " + getFuel();
    }
}
