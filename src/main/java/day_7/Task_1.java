package day_7;

import day_6.Airplane;

/**
 * В классе Самолет создать статический метод compareAirplanes, который в
 * качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
 * сообщение в консоль о том, какой из самолетов длиннее.
 */
public class Task_1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeng", 2020, 50, 579);
        Airplane airplane2 = new Airplane("Boeng", 2023, 55, 523);
        System.out.println(Airplane.compareAirplanes(airplane1, airplane2));
    }
}
