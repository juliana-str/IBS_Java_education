package day_2;

import java.util.Scanner;

public class Task_4 {
    /**
     * Реализовать программу, которая принимает на вход через консоль с помощью класса
     * Scanner, число x. Для этого числа, по формуле выше, необходимо вычислить
     * значение y.
     * (Для этих вещественных чисел x и y необходимо использовать тип double и метод
     * nextDouble() у Scanner’а соответственно, чтобы считать из консоли число x).
     */
    public static double calculateDoubleY(double x) {
        if (x >= 5) {
            return (Math.pow(x, 2) - 10) / (x + 7);
        } else if (-3 < x & x < 5) {
            return (x + 3) * (Math.pow(x, 2) - 2);
        } else {
            return 420;
        }
    }

    public static double getNextDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        double value = getNextDouble();
        System.out.println(calculateDoubleY(value));
    }
}
