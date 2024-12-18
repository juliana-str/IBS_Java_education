package day_2;

import java.util.Scanner;

public class Task_1 {
    /**
     * Реализовать программу, которая принимает на вход через консоль с помощью
     * класса Scanner, число, соответствующее количеству этажей в здании. Используя
     * условный оператор if, необходимо вывести в консоль сообщение о типе такого дома.
     * Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более
     * - “Многоэтажный дом”. Так же, необходимо учесть что может быть введено
     * отрицательное значение, в таком случае сообщить “Ошибка ввода”.
     */
    public static String getTypeBuilding(int floorCount) {
        if (floorCount < 1) {
            return "Ошибка ввода";
        }
        if (floorCount < 5) {
            return "Малоэтажный дом";
        } else if (floorCount <= 8) {
            return "Среднеэтажный дом";
        } else {
            return "Многоэтажный дом";
        }
    }

    static int getNextInt() {
        System.out.println("Введите целое число.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int floorCount = getNextInt();
        System.out.println(getTypeBuilding(floorCount));
    }
}
