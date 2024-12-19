package day_3;

import static day_2.Task_4.getNextDouble;

public class Task_2 {
    /**
     * Реализовать программу, которая пока работает, принимает на вход от пользователя
     * два числа - делимое и делитель. Для этих двух чисел программа рассчитывает
     * результат деления и выводит его в консоль. Программа останавливает свою работу
     * тогда, когда пользователь вводит 0 в качестве делителя.
     * (для этих вещественных чисел необходимо использовать тип double и метод
     * nextDouble() у Scanner’а соответственно).
     */
    public static void makeDivisionUnlimit() {
        while (true) {
            double num1 = getNextDouble();
            double num2 = getNextDouble();
            if (num2 == 0) {
                break;
            }
            makeDivision(num1, num2);
        }
    }

    public static void makeDivision(double num1, double num2) {
        System.out.println(num1 / num2);
    }

    public static void main(String[] args) {
        makeDivisionUnlimit();
    }
}
