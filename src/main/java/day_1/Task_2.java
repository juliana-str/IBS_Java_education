package day_1;

/**
 * Повторить задание 1, но используя цикл for.
 */
public class Task_2 extends Task_1{
    public static void printJavaWordInLineFor() {
        for (int i = 0; i < COUNT; i++) {
            printWords("line", WORD_FOR_PRINT);
        }
    }

    public static void main(String[] args) {
        printJavaWordInLineFor();
    }
}
