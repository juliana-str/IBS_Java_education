package day_2;

import java.util.Scanner;

public class Task_2 extends Task_1{
    /**
     * Есть два числа, которые задаются пользователем через консоль (назовем эти два
     * числа a и b). Используя цикл for, вывести все числа из диапазона между a и b,
     * которые делятся на 5 без остатка, но при этом не делятся на 10 без остатка.
     * <p>
     * Например, число 15 подходит под наше условие (делится на 5 без остатка и не
     * делится на 10 без остатка), но число 20 не подходит под наше условие (делится на 5
     * без остатка и делится на 10 без остатка). Сами числа a и b в диапазоне не учитывать.
     * Если a >= b вывести сообщение "Некорректный ввод".
     */
    public static void printNumsArray(int a, int b) {
        for (int i = a + 1; i < b; i++) {
            if (i % 5 == 0 & i % 10 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean checkNums(int a, int b) {
        if (a >= b) {
            System.out.println("Некорректный ввод");
            return false;
        } else return true;
    }

    public static void main(String[] args) {
        int a = getNextInt();
        int b = getNextInt();
        if (checkNums(a, b)) {
            printNumsArray(a, b);
        }
    }
}
