package day_1;

public class Task_4 extends Task_1 {
    static int YEAR = 1980;
    static int LASTYEAR = 2020;
    /**
     * Объявите переменную типа int, имя переменной - year. Присвойте этой
     * переменной значение 1980. Используя цикл while, выведите в столбик строки вида
     * “Олимпиада X года”, где X - это число, которое принимает значения, начиная от 1980
     * до 2020 с шагом увеличения равным 4.
     */
    static void printOlimpiadaYear(int year, int yearLast) {
        while (year <= yearLast) {
            printWords("column", "Олимпиада " + year + " года");
            year += 4;
        }
    }

    public static void main(String[] args) {
        printOlimpiadaYear(YEAR, LASTYEAR);
    }
}
