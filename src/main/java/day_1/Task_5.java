package day_1;

/**
 * Повторить задание 4, но используя цикл for.
 */
public class Task_5 extends Task_4 {

    public static void printOlimpiadaYearFor(int year, int yearLast) {
        for (int i = year; i <= yearLast; i += 4) {
            printWords("column", "Олимпиада " + i + " года");
        }
    }

    public static void main(String[] args) {
        printOlimpiadaYearFor(YEAR, LASTYEAR);
    }
}
