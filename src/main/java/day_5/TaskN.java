package day_5;

/**
 * 1) Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
 * задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 * 2) Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”,
 * “Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
 * использовать). Придерживаться принципов инкапсуляции и использовать ключевое
 * слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
 * консоль.
 */
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
