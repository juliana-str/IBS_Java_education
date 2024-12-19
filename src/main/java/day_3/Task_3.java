package day_3;

import static day_2.Task_4.getNextDouble;
import static day_3.Task_2.makeDivision;

public class Task_3 {
    /**
     * Реализовать программу, которая 5 раз запрашивает от пользователя два числа -
     * делимое и делитель. Для этих двух чисел программа рассчитывает результат деления
     * и выводит его в консоль. Если пользователь вводит 0 в качестве делителя, вместо
     * того, чтобы останавливать работу цикла принудительно, мы пропускаем итерацию и
     * выводим в консоль сообщение “Деление на 0”.
     * Ключевое слово else использовать в этой программе нельзя.
     */
    public static void makeDivisionFiveTimes() {
        for (int i = 0; i < 5; i++) {
            double num1 = getNextDouble();
            double num2 = getNextDouble();
            if (num2 == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            makeDivision(num1, num2);
        }
    }

    public static void main(String[] args) {
        makeDivisionFiveTimes();
    }
}
