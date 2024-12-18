package day_1;

public class Task_3 extends Task_1 {
    /**
     * Вывести на экран слово “JAVA”, в столбик, чтобы оно повторилось 10 раз,
     * используя цикл на ваше усмотрение (for или while).
     */
    public static void printJavaWordInColumn() {
        for (int i = 0; i < COUNT; i++) {
            printWords("column", WORD_FOR_PRINT);
        }
    }

    public static void main(String[] args) {
        printJavaWordInColumn();
    }
}
