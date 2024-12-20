package day_1;

import java.util.Random;

/**
 * Объявите переменную типа int, имя переменной - k. Присвойте этой переменной
 * какую-нибудь цифру от 1 до 9. Используя цикл на ваше усмотрение (for или while),
 * выведите в консоль таблицу умножения для этой цифры.
 */
public class Task_6 extends Task_1 {

    public static void printMultiplicationTable(int k) {
        for (int num = 1; num < COUNT; num++) {
            printWords("column", num + " x " + k + " = " + num * k);
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        int k = r.nextInt(9);
        printMultiplicationTable(k);
    }
}
