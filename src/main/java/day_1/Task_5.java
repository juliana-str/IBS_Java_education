package day_1;

public class Task_5 extends Task_4{
    /**
     * Повторить задание 4, но используя цикл for.
     */
    static void printOlimpiadaYearFor(int year, int yearLast) {

        for (int i = year; i <= yearLast; i += 4) {
            printWords("column", "Олимпиада " + i + " года");
        }
    }

    public static void main(String[] args) {
        printOlimpiadaYearFor(YEAR, LASTYEAR);
    }
}
